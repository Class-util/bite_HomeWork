package HomeWork_2021._2021_3;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;



import javax.sql.DataSource;

import java.math.BigDecimal;
import java.sql.*;

import java.text.ParseException;

import java.text.SimpleDateFormat;
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2021 03 22
 * Time:12:15
 */
public class Util {
    //使用连接池
    private static final DataSource DATA_SOURCE    = new MysqlDataSource();

    static {
        ((MysqlDataSource) DATA_SOURCE).setUrl("jdbc:mysql://localhost:3306/ebook");

        ((MysqlDataSource) DATA_SOURCE).setUser("root");

        ((MysqlDataSource) DATA_SOURCE).setPassword("120917981");
    }

    public static void main(String[] args) {
        System.out.println(getConnection());
    }

// 获取数据库连接

    public static Connection getConnection(){
        try {
            return DATA_SOURCE.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException("获取数据库连接失败", e);
        }
    }
    // 释放资源
    public static void close(ResultSet resultSet, Statement statement, Connection connection){
        try {
            if(resultSet != null) {
                resultSet.close();
            }
            if(statement != null){
                statement.close();
            }
            if(connection != null){
                connection.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException("数据库操作异常", e);
        }
    }

//日期字符串转Java日期类Date和sql时间戳Timestamp

    public static Timestamp getTimestamp(String dateString){
        try {
            // 年-月-日 小时:分钟:秒
            java.util.Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(dateString);
            return new java.sql.Timestamp(date.getTime());
        } catch (ParseException e) {
            throw new RuntimeException("日期格式化错误："+dateString, e);
        }
    }
}


class AddBorrow {

    /**

     * 新增貂蝉同学的借阅记录：诗经，从2019年9月25日17:50到2019年10月25日17:50

     */

    public static void main(String[] args) {
        //1.创建数据库连接对象
        Connection connection = null;
        //2.创建操作命令对象
        PreparedStatement preparedStatement = null;
        try {
            connection = Util.getConnection();
            String sql = "insert into borrow_info(book_id, student_id," +

                    " start_time, end_time) select b.id,s.id,?,?" +

                    " from book b,student s where b.name=? and s.name=?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setTimestamp(1, Util.getTimestamp("2019-09-25 17:50:00"));
            preparedStatement.setTimestamp(2, Util.getTimestamp("2019-10-25 17:50:00"));
            preparedStatement.setString(3, "诗经");
            preparedStatement.setString(4, "貂蝉");
            System.out.println(preparedStatement);
            //3.执行sql
            int result = preparedStatement.executeUpdate();
            System.out.println(result);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //4.释放资源
            Util.close(null, preparedStatement, connection);
        }
    }
}

class QueryBorrow {
    /**

     * 查询计算机分类下的图书借阅信息

     * @param args

     */
    public static void main(String[] args) {
        Connection    connection    = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = Util.getConnection();
            String sql = "SELECT bk.NAME book_name,bk.author book_author," +
                    "s.NAME student_name,bi.start_time,bi.end_time" +
                    " FROM borrow_info bi JOIN book bk ON bi.book_id = bk.id" +
                    " JOIN category c ON bk.category_id = c.id" +
                    " JOIN student s ON bi.student_id = s.id" +
                    " WHERE c.NAME = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "计算机");
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                String  bookName  = resultSet.getString("book_name");
                String  bookAuthor = resultSet.getString("book_author");
                String  studentName = resultSet.getString("student_name");
                Timestamp startTime  = resultSet.getTimestamp("start_time");
                Timestamp  endTime   = resultSet.getTimestamp("end_time");
                System.out.println(String.format("书名：%s，作者：%s，借阅者：%s，" +
                                "借阅起始日期：%s，结束日期：%s",
                        bookName, bookAuthor, studentName, startTime, endTime));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Util.close(resultSet, preparedStatement, connection);
        }

    }

}

class UpdateBook {
    /**

     * 修改图书《深入理解Java虚拟机》的价格为61.20

     */

    public static void main(String[] args) {
        Connection    connection    = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = Util.getConnection();
            String sql = "update book set price=? where name =?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setBigDecimal(1, new BigDecimal("61.20"));
            preparedStatement.setString(2, "深入理解Java虚拟机");
            System.out.println(preparedStatement);
            int result = preparedStatement.executeUpdate();
            System.out.println(result);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Util.close(null, preparedStatement, connection);
        }
    }
}

class DeleteBorrow {
    /**

     * 删除id最大的一条借阅记录

     */
    public static void main(String[] args) {
        Connection    connection    = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = Util.getConnection();
            String sql = "delete from borrow_info where id =" +
                    "(select r.id from (select max(id) id from borrow_info) r)";
            preparedStatement = connection.prepareStatement(sql);
            int result = preparedStatement.executeUpdate();
            System.out.println(result);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Util.close(null, preparedStatement, connection);
        }
    }
}
