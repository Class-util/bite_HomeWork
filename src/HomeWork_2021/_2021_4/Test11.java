package HomeWork_2021._2021_4;

import java.lang.reflect.Array;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2021 04 22
 * Time:22:12
 */
public class Test11 {
    public static void main(String[] args) {
        func1();
        func();
    }

    //求最大连续bit数
    public static void func1(){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            String str = Integer.toBinaryString(n);
            String[] arr = str.split("0");
            int max = 0;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i].length() > max){
                    max = arr[i].length();
                    continue;
                }
            }
            System.out.println(max);
        }
    }


    //求最大连续bit数
    public static void func(){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            StringBuilder sb = new StringBuilder();
            while (n > 0){
                sb.append(n % 2);
                n = n / 2;
            }
            ArrayList<Integer> arr = new ArrayList<>();
            int count = 0;
            for (int i = 0; i <= sb.length() - 1 - 1; i++) {
                if("1".equals(sb.charAt(i) + "") && sb.charAt(i) == sb.charAt(i + 1)){
                    count++;
                }else {
                    if(!"1".equals(sb.charAt(i) + "")){
                        arr.add(count);
                        count = 0;
                    }else {
                        count++;
                        arr.add(count);
                        count = 0;
                    }
                }
            }
            arr.add(count + 1);
            arr.sort((o1, o2) -> o2 - o1);
            System.out.println(arr.get(0));
        }
    }

    //最近公共祖先
    public int getLCA(int a, int b) {
        // write code here
        while(a != b){
            if(a > b){
                a /= 2;
            }else{
                b /= 2;
            }
        }
        return a;
    }
}
