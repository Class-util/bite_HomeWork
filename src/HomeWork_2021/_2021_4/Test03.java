package HomeWork_2021._2021_4;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2021 04 16
 * Time:23:12
 */

class helloA{
    public helloA() {
        System.out.println("i am a class");
    }
    static {
        System.out.println("static a");
    }
}

public class Test03 extends helloA {
    public Test03() {
        System.out.println("i am b class");
    }
    static {
        System.out.println("static b");
    }

    public static void main(String[] args) {
        new Test03();
        int fun = fun(10);
        System.out.println(fun);
        boolean b = true?false:true==true?false:true;
        int i = 5>3?1:2;
        System.out.println(b);
    }
    public static int fun(int a){
        try {
            a += 10;
            return a;
        }catch (RuntimeException e){

        }catch (Exception e1){

        }finally {
            a += 10;
            return a;
        }
    }
}
