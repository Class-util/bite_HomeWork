package HomeWork_2020._12_4;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2020 12 05
 * Time:12:36
 */
public class Test14 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入一个整数");
            int num = scanner.nextInt();
            print(num);
        }
    public static void print(int num) {
        if(num > 9) {
            print(num / 10);
        }
        System.out.print(num % 10  + " ");
    }
}
