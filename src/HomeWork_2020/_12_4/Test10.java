package HomeWork_2020._12_4;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2020 12 05
 * Time:12:10
 */
public class Test10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入数字1：");
        int a = scanner.nextInt();
        System.out.println("请输入数字2：");
        int b = scanner.nextInt();

        //求出两个数字之间的小值
        int min = Math.min(a, b);

        for (int i = min;i >= 1;i --) {
            if (a % i == 0 && b % i == 0) {
                System.out.println("最大公约数是：" + i);
                break;
            }
        }
    }
}
