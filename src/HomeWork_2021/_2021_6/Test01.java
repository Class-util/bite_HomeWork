package HomeWork_2021._2021_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2021 06 03
 * Time:13:27
 */
public class Test01 {

    //发邮件
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int num = sc.nextInt();
            long[] arr = new long[21];
            arr[0] = 0;
            arr[1] = 0;
            arr[2] = 1;
            for(int i = 3 ; i < arr.length; i++){
                arr[i] = (i - 1) * (arr[i - 1] + arr[i - 2]);
            }
            System.out.println(arr[num]);
        }
    }

    //最长上升子序
        public static void main2(String[] args){
            Scanner cin=new Scanner(System.in);
            while(cin.hasNext()){
                int number=cin.nextInt();
                int result=1;//结果
                int[] arr=new int[number];//数据初始化
                for(int i=0;i<number;i++){
                    arr[i]=cin.nextInt();
                }
                int[] dp=new int[number];
                dp[0]=1;
                for(int i=0;i<number;i++){
                    dp[i]=1;
                    for(int j=0;j<i;j++){
                        if(arr[j]<arr[i]&&dp[j]>=dp[i]){
                            dp[i]=dp[j]+1;
                            result= Math.max(dp[i], result);
                        }
                    }
                }
                System.out.println(result);
            }
        }

    public static void main1(String[] args) {
        Scanner sc  = new Scanner(System.in);
        while(sc.hasNext()){
            int num = sc.nextInt();
            int[] arr = new int[num];
            for(int i = 0; i < num; i++){
                arr[i] = sc.nextInt();
            }
            int max = 0;
            int start = 0;
            while(num != 0){
                int count = func(start, arr);
                start++;
                max = Math.max(count,max);
                num--;
            }
            System.out.println(max);
        }
    }
    public static int func(int start,int[] arr){
        List<Integer> list = new ArrayList<>();
        list.add(arr[start]);
        int tmp = arr[start];
        for (int i = start; i < arr.length - 1; i++) {
            if(tmp < arr[i + 1]){
                list.add(arr[ i + 1]);
                tmp = arr[ i + 1];
            }
        }
        return list.size();
    }
}
