package HomeWork_2021._2021_4;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2021 04 21
 * Time:16:08
 */

public class Test09{

    //数字颠倒
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder(n + "");
        System.out.println(sb.reverse());
    }

    //末尾0的个数：因为可以产生0的是偶数*5，所以记录每一数字中包含5的个数，比如10就有10和5
    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = n; i >= 5; i--) {
            int tmp = i;
            while (tmp % 5 == 0){
                count++;
                tmp /= 5;
            }
        }
        System.out.println(count);
    }

    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long num = 1;
        for(int i = 1;i <= n; i++){
            num*=i;
        }
        String str = num + "";
        int count = 0;
        for (int length = str.length() - 1; length >= 0; length--) {
            if("0".equals(str.charAt(length) + "")){
                count++;
            }else {
                break;
            }
        }
        System.out.println(count);
    }
}
