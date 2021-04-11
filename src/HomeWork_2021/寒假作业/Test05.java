package HomeWork_2021.寒假作业;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2021 03 28
 * Time:21:46
 */
public class Test05 {
    String str=new String("hello");
    char[]ch={'a','b'};
    static int i;
    public static void main(String args[]){
        Test05 ex=new Test05();
        ex.change(ex.str,ex.ch);
        System.out.print(ex.str+" and ");
        System.out.print(ex.ch);
        System.out.println(i);
        System.out.println(100%3);
        System.out.println(100%3.0);
        A.method2();
        A a = new A();
    }
    public void change(String str,char ch[]){
        str="test ok";
        ch[0]='c';
    }
}

class A{
    public int i;
    static String s;
    void method1(){}
    static void method2(){}
}
