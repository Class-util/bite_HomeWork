package HomeWork_2020._12_6;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2020 12 06
 * Time:23:43
 */
public class Test13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sum(n);
        System.out.println(sum);
    }
    public static int sum(int i){
        if(i == 1){
            return 1;
        }
        return i + sum(i - 1);
    }
}
