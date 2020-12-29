package HomeWork_2020._12_29;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2020 12 29
 * Time:14:13
 */
public class Test01 {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        //添加元素，两种方式
        myArrayList.add(0,1);
        myArrayList.add(1,2);
        myArrayList.add(2,3);
        myArrayList.add(3,4);
        myArrayList.add(4,6);
        //获取顺序表长度
        int size = myArrayList.size();
        System.out.println(size);
        myArrayList.add(5,7);
        //打印顺序表
        myArrayList.display();
        myArrayList.resize();
        myArrayList.add(7);
        myArrayList.display();
        //删除元素
        myArrayList.remove(1);
        myArrayList.display();
        //查找元素
        int search = myArrayList.search(2);
        System.out.println(search);
        //判断是否包含某个元素
        boolean contains = myArrayList.contains(2);
        System.out.println(contains);
        boolean contains1 = myArrayList.contains(77);
        System.out.println(contains1);
        //获取pos位置元素
        int pos = myArrayList.getPos(3);
        System.out.println(pos);
        //给pos位置设value
        myArrayList.setPos(1,66);
        myArrayList.display();
        //清空顺序表
        myArrayList.clear();
        myArrayList.display();
    }
}
