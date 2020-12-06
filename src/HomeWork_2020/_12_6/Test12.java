package HomeWork_2020._12_6;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2020 12 06
 * Time:23:39
 */
public class Test12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        num(n);
    }
    public static void num(int n){
        if(n>9){
            num(n/10);
        }
        System.out.println(n%10);
    }
}
