package HomeWork_2020._12_4;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2020 12 05
 * Time:11:21
 */
public class Test04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println((isPrime(i)?"是素数":"不是素数"));
    }
    public static boolean isPrime(int num) {
        int max = (int)Math.sqrt(num);
        for (int i = 2; i <= max; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
