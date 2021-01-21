package HomeWork_2021._2021_1_19;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2021 01 21
 * Time:21:56
 */
//class T {
//    public T() {
//    }
//}
//class A extends T{
//    public A() {
//    }
//}
//class B extends A{
//    public B() {
//    }
//}
public class Test03 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(1);
        list.add(3);
//        System.out.println(list);
//        List<Class<? extends T>> list1 = new ArrayList<>();
//        A a = new A();
//        B b = new B();
//        T t = new T();

        A<Integer> a = new A<>(5);
        Integer i = a.get();
        System.out.println(a.value);
        System.out.println(i);
    }
    public static void func(List<Object> list){
        System.out.println("hhh");
    }
}
