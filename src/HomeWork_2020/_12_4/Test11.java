package HomeWork_2020._12_4;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2020 12 05
 * Time:12:12
 */
public class Test11 {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        int nums = sc.nextInt();
        String str = Integer.toBinaryString(nums);
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '1'){
                count++;
            }
        }
        System.out.println(count);
    }
}
