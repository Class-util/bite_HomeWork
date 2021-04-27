package HomeWork_2021._2021_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2021 04 27
 * Time:12:10
 */
public class Test14 {
    //幸运袋子
    static int count;
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            int n=input.nextInt();
            int[] x=new int[n];
            for(int i=0; i<n; i++)
                x[i]=input.nextInt();
            Arrays.sort(x);
            count=0;
            func(x, 0, 0, 1);
            System.out.println(count);
        }
    }
    public static void func(int[] x, int index, int num, int mul){
        if(index!=0){
            if(num>mul)
                count++;
            else if(num<mul)
                return;
        }
        for(int i=index; i<x.length; i++){
            num+=x[i];
            mul*=x[i];
            func(x, i+1, num, mul);
            num-=x[i];
            mul/=x[i];
            while(i<x.length-1 && x[i]==x[i+1])
                i++;
        }
    }


    //幸运的袋子（只过了10%的测试用例）
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0;i < n;i++){
                arr[i] = sc.nextInt();
            }
            //计数
            int count = 0;
            //正着移除0个到n-1个
            for(int i = 0; i <= n-1; i++){
                int sum = 0;
                int product = 1;
                for(int j = i; j < arr.length ; j++){
                    sum += arr[j];
                    product *= arr[j];
                }
                if(sum > product){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
    //计算日期到天数转换
    public static int iConverrDateToDay(int year,int month,int day){
        int[] Day = {31,28,31,30,31,30,31,31,30,31,30,31};

        if(year <= 0 ||month <= 0 || month > 12 || day<= 0 || day > Day[month - 1])
            return -1;

        //判断是否是闰年
        if(year%4 == 0 && year%100 != 0 || year%400 == 0){
            Day[1] = 29;
        }
        int sum = 0;
        for(int i = 0;i < month - 1;i++){
            sum += Day[i];
        }
        return sum + day;
    }
}
