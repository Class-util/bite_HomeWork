package HomeWork_2020._12_4;

import java.util.Random;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2020 12 05
 * Time:11:40
 */
public class Test07 {
    public static void main(String[] args) {
        Random rm = new Random();
        int i = rm.nextInt(100)+1;
//        System.out.println(i);
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("输入你猜的数字：");
            int num = sc.nextInt();
            if(num > i){
                System.out.println("猜大了");
            }else {
                if(num < i){
                    System.out.println("猜小了");
                }else {
                    System.out.println("猜中了");
                    break;
                }
            }
        }
    }
}
