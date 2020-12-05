package HomeWork_2020._12_4;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2020 12 05
 * Time:11:24
 */
public class Test05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       while (true){
           System.out.println("请输入年龄：");
           int i = sc.nextInt();
           printYear(i);
       }
    }
    public static void printYear(int year){
        if(year > 56){
            System.out.println("老年");
        }else {
            if ((year >= 29) && (year <= 55)){
                System.out.println("中年");
            }else {
                if((year >= 19) && (year <= 28)){
                    System.out.println("青年");
                }else {
                    System.out.println("少年");
                }
            }
        }
    }
}
