package HomeWork_2021._2021_5;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2021 05 25
 * Time:13:53
 */
public class Test13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str = sc.nextLine();

        }
    }

    //斐波那契凤尾
    public static void main3(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100001];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = (arr[i - 1] + arr[i - 2])%1000000;
        }
        while(sc.hasNextInt()){
            int num = sc.nextInt();
            System.out.printf((num < 25 ? "%d\n" : "%06d\n"), arr[num]);
        }
    }

    //会报超时
    public static void main1(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n=in.nextInt();
            long a=0,b=1,sum=0;
            for (int i = 0; i < n; i++) {
                sum=(a+b)%1000000;
                a=b;
                b=sum;
            }
            System.out.println(sum);
        }
    }

    public static void main2(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int num = sc.nextInt();
            if(num == 1){
                System.out.println("1");
            }else{
                if(num == 2){
                    System.out.println("2");
                }else{
                    long a = 1;
                    long b = 2;
                    long ret = 0;
                    int count = 2;
                    while(count != num){
                        //一旦位数超过六位那么只取后六位
                        ret = (a + b)%1000000;
                        a = b;
                        b = ret;
                        count++;;
                    }
                    System.out.println(ret);
                }
            }
        }
    }
}
