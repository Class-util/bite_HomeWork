package HomeWork_2021._2021_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2021 04 16
 * Time:15:31
 */
public class Test02 {
    public static void main(String[] args) {
        func1();
    }
    //统计回文数
    public static void func(){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String a = sc.nextLine();
            String b = sc.nextLine();
            //用来记录回文字符串的个数
            int count = 0;
            //ab能组成a.length() + 1个字符串
            for (int i = 0; i < a.length() + 1; i++) {
                //构建字符串
                String str = a.substring(0,i) + b + a.substring(i,a.length());
                StringBuilder s = new StringBuilder(str);
                //通过StringBuilder中的字符串反转方法得到的值与自身比较，如果相同则是回文字符串
                if(s.reverse().toString().equals(str)){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
    //连续最大和
    public static void func1(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //用来存储最大值
        int max = Integer.MIN_VALUE;
        //用来存储每次和的最大值
        int sum = 0;
        for (int i = 0; i < n; i++) {
            //如果遇到符号不相同的数，加完后肯定会减小，所以存储他俩中的最大值
            sum = Math.max(sum + arr[i] , arr[i]);
            //用来比较所有的和中的最大值
            max = Math.max(max,sum);
        }
        System.out.println(max);
        /*//用来存储和
        int sum = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if((sum >=0 && arr[i] >= 0) || (sum < 0 && arr[i] < 0)){
                sum += arr[i];
            }else {
                list.add(sum);
                sum = 0;
                sum += arr[i];
            }
        }
        list.add(sum);
        list.sort(((o1, o2) -> o2 - o1));
        System.out.println(list);
        System.out.println(list.get(0));*/
    }
}
