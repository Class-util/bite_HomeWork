package HomeWork_2020._12_6;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2020 12 06
 * Time:23:46
 */
public class Test14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int fun = fun(i);
        System.out.println(fun);
    }
    public static int fun(int n){
        if(n == 1)
            return 1;
        return n * fun(n - 1);
    }
}
