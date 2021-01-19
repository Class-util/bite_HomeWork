package HomeWork_2021._2021_1_19;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * 自定义异常实现登录
 * User:吴博
 * Date:2021 01 19
 * Time:17:05
 */
class UsernameException extends Exception {
    public UsernameException(String message) {
        super(message);
    }
}
class passwordException extends Exception {
    public passwordException(String message) {
        super(message);
    }
}
public class Test02 {
    private static String username = "admin";
    private static String password = "12345";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请登录");
        System.out.println("请输入用户名：");
        String user = sc.nextLine();
        System.out.println("请输入密码：");
        String pass = sc.nextLine();
        System.out.println("登陆中....");
        try {
            Login(user,pass);
        }catch (UsernameException | passwordException e){
            e.printStackTrace();
        }
    }
    //登录
    public static void Login(String username, String password) throws UsernameException, passwordException {
            if (!Test02.username.equals(username)) {
                throw new UsernameException("用户名错误");
            }
            if (!Test02.password.equals(password)) {
                throw new passwordException("密码错误");
            }
            System.out.println("登陆成功");
        }
    }
