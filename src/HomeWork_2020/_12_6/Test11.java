package HomeWork_2020._12_6;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2020 12 06
 * Time:23:36
 */
public class Test11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int sum = sum(i);
        System.out.println(sum);
    }
    public static int sum(int num) {
        if (num < 10) {
            return num;
        }
        return num % 10 + sum(num / 10);
    }
}
