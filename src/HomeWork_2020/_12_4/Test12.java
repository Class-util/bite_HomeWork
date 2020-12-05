package HomeWork_2020._12_4;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2020 12 05
 * Time:12:18
 */
public class Test12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums = sc.nextInt();
        String str = Integer.toBinaryString(nums);
        for (int i = 1; i < str.length(); i=i+2) {
            System.out.println("奇数序列为：");
            System.out.print(str.charAt(i));
        }
        System.out.println("");
        for (int i = 0; i < str.length(); i=i+2) {
            System.out.println("偶数序列为：");
            System.out.print(str.charAt(i));
        }
    }
}
