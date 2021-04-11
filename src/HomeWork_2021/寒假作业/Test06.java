package HomeWork_2021.寒假作业;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2021 04 11
 * Time:20:03
 */
public class Test06 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            if(!s2.contains(s1.charAt(i) + "")){
                sb.append(s1.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }

    public static void main3(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int n = scan.nextInt();
            if (n == 0) {
                System.out.println(0);
                return;
            }
            long[] arr = new long[3 * n];
            for (int i = 0; i < 3 * n; i++) {
                arr[i] = scan.nextInt();
            }
            Arrays.sort(arr);
            long sum = 0;

            for (int i = 3 * n - 2; i >= n; i -= 2) {
                sum += arr[i];
            }
            System.out.println(sum);
        }
    }

    public static void main2(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int n = scan.nextInt();
            int[] arr = new int[3 * n];
            for (int i = 0; i < 3 * n; i++) {
                arr[i] = scan.nextInt();
            }
            Arrays.sort(arr);
            int sum = 0;
            for (int i = 3 * n - 2; i > n; i--) {
                sum += arr[i];
            }
            System.out.println(sum);
        }
    }

    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        //第一次输入的数字
        int n = sc.nextInt();
        //第二次要输入3*n的数字
        //创建3*n的数组存储
        List<Integer> list = new ArrayList<>();
        while (sc.hasNextInt()){
            list.add(sc.nextInt());
        }
        //按从大到小的顺序排列
        list.sort((o1, o2) -> o2 -o1);
        //长度为0，直接返回0
        int ret = 0;
        if(list.size() == 0){
            System.out.println(ret);
            return ;
        }
        if(n == 1){
            ret = list.get(0) + list.get(1) + list.get(2);
            System.out.println(ret);
            return ;
        }
        //大于0
        int count = 0;
        while (count != n){
            ret += list.get(n + count);
            count++;
        }
        System.out.println(ret);
    }
}
