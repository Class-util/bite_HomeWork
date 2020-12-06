package HomeWork_2020._12_6;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2020 12 06
 * Time:23:19
 */
public class Test06 {
    public static void main(String[] args) {
        int i = maxTwo(4, 5);
        System.out.println(i);
        int j = maxThree(6, 5, 9);
        System.out.println(j);
    }
    public static int maxTwo(int a,int b){
        return Math.max(a,b);
    }
    public static int maxThree(int a,int b,int c){
        return Math.max(Math.max(a,b),c);
    }
}
