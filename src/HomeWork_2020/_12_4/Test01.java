package HomeWork_2020._12_4;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2020 12 04
 * Time:23:54
 */
public class Test01 {
    public static void main(String[] args) {
        int fun = fun();
        System.out.println(fun);
    }
    public static int fun(){
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            String s = i + "";
            for (int j = 0; j < s.length(); j++) {
                if(s.charAt(j)=='9'){
                    count++;
                }
            }
        }
        return count;
    }
}
