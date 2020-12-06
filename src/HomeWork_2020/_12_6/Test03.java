package HomeWork_2020._12_6;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2020 12 06
 * Time:23:02
 */
public class Test03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int fun = fun(i);
        System.out.println(fun);
    }
    public static int fun(int n){
        int count = 0;
        for (int i = 1; i <= n; i++) {
            int num = 1;
            for (int j = 1; j <= i; j++) {
                num *= j;
            }
            count += num;
        }
        return count;
    }
}
