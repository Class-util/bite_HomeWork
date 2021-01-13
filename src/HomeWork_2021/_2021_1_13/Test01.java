package HomeWork_2021._2021_1_13;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2021 01 13
 * Time:19:23
 */
class Base {

    Base() {

        System.out.print("Base");

    }

}
public class Test01 extends Base{
    public static void main(String[] args) {
        new Test01();
        new Base();
    }

}
