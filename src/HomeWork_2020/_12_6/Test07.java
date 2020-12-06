package HomeWork_2020._12_6;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2020 12 06
 * Time:23:22
 */
public class Test07 {
    public static void main(String[] args) {
        System.out.println(maxThree(1.2, 3.5, 5));
    }
    public static int maxTwoInt(int a,int b){
        return Math.max(a,b);
    }
    public static double maxTwoDouble(double a, double b){
        return Math.max(a,b);
    }
    public static double maxThree(double a,double b,int c){
        double i = maxTwoDouble(a,b);
        return i > c ? i : c;
    }
}
