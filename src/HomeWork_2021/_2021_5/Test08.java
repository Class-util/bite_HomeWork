package HomeWork_2021._2021_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2021 05 12
 * Time:21:47
 */
public class Test08 {

    //小易的升级之路
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int num = sc.nextInt();
            int a = sc.nextInt();
            int[] arr = new int[num];
            for (int i = 0; i < num; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < arr.length; i++) {
                if(a >= arr[i]){
                    a += arr[i];
                }else {
                    int ret = findNum(a,arr[i]);
                    a += ret;
                }
            }
            System.out.println(a);
        }
    }

    //找两个数的最大公因数
    public static int findNum(int x,int y){
        //保证x是大数，y是小数
        if(x < y){
            int tmp = y;
            y = x;
            x = tmp;
        }
        if(x % y == 0){
            return y;
        }else {
            for (int i = y; i > 0; i--) {
                if(y % i == 0 && x % i == 0){
                    return i;
                }
            }
        }
        return 1;
    }

    //找出字符串中只出现第一次的字符
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.next();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < str.length(); i++) {
                int count = 0;
                for (int j = 0; j < str.length(); j++) {
                    if(str.charAt(i) == str.charAt(j)){
                        count++;
                    }
                }
                list.add(count);
            }
            //System.out.println(list);
            boolean b = true;
            for (int i = 0; i < list.size(); i++) {
                if(list.get(i) == 1){
                    System.out.println(str.charAt(i));
                    b = false;
                    break;
                }
            }
            if(b){
                System.out.println(-1);
            }
        }
    }
}
