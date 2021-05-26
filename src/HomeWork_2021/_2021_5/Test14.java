package HomeWork_2021._2021_5;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2021 05 26
 * Time:18:00
 */
public class Test14 {
    //客似云来
    static long[] arr = new long[100];
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int from = sc.nextInt();
            int to = sc.nextInt();
            func();
            long ret = 0;
            for(int i = from - 1; i <= to - 1; i++){
                ret += arr[i];
            }
            System.out.println(ret);
        }
    }
    //计算斐波那契数
    public static void func(){
        arr[0] = 1;
        arr[1] = 1;
        for(int i = 2; i < arr.length; i++){
            arr[i] = arr[i - 1] + arr[i - 2];
        }
    }

    //剪花布条
    public static void main1(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            //进行字符串分割，用字符数组存储
            String[] arr = str.split(" ");
            //计数
            int count = 0;
            //第一个指针,指向花布条
            int flog1 = 0;
            //第二个指针，指向小饰条
            int flog2 = 0;
            while(flog1 < arr[0].length()){
                if(flog2 == arr[1].length()){
                    //说明已经分解出一个
                    count++;
                    //将指针2归0
                    flog2 = 0;
                }
                //如果相等则两个指针都移动，如果不相等则只移动指针1，并将指针2置位0
                if(arr[0].charAt(flog1) == arr[1].charAt(flog2)){
                    flog1++;
                    flog2++;
                }else{
                    flog1++;
                    flog2 = 0;
                }
            }
            if(flog2 == arr[1].length()){
                count++;
            }
            System.out.println(count);
        }
    }
}
