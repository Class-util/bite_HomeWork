package HomeWork_2021._2021_5;

import javax.xml.transform.Source;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2021 05 31
 * Time:19:38
 */
public class Test17 {
    //mkdir
    public static void main4(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            String[] arr = new String[n];
            for (int i = 0; i < arr.length; i ++ ) {
                arr[i] = sc.next();
            }
            Arrays.sort(arr);
            List<String> res = new ArrayList<>();
            for (int i = 1; i < arr.length; i ++ ) {
                if( ! arr[i].startsWith(arr[i - 1] + "/")) res.add(arr[i - 1]);
            }
            res.add(arr[n - 1]);
            for (String s:res) {
                System.out.println("mkdir -p " + s);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = Integer.parseInt(sc.nextLine());
            String[] str = new String[n];
            for(int i = 0; i < n; i++){
                str[i] = sc.nextLine();
            }
            //将数组中按长度顺序排序
            Arrays.sort(str);
            //判断是否是子路径
            int size = 1;
            while(size < str.length){
                while(size < str.length && str[size - 1].equals(str[size].substring(0,str[size - 1].length()))){
                    if(size + 1 > str.length){
                        break;
                    }else {
                        size++;
                    }
                }
                if(size + 1 > str.length){
                    break;
                }else {
                    System.out.println("mkdir -p " + str[size - 1]);
                    size++;
                }
            }
            System.out.println("mkdir -p " + str[size - 1]);
            System.out.println();
        }
    }

    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = Integer.parseInt(sc.nextLine());
            String[] str = new String[n];
            for(int i = 0; i < n; i++){
                str[i] = sc.nextLine();
            }
            //将数组中按长度顺序排序
            for (int i = 0; i < str.length - 1; i++) {
                if(str[i].length() > str[i + 1].length()){
                    //交换
                    String tmp = str[i];
                    str[i] = str[i + 1];
                    str[i + 1] = tmp;
                }
            }
            //判断是否是子路径
            int size = 0;
            while(size < str.length - 1 && str[size].equals(str[size + 1].substring(0,str[size].length()))){
                size++;
            }
            System.out.println("mkdir -p " + str[size]);
            //如果没有完，则继续判断
            if(size != str.length - 1){
                for (int i = size + 1; i < str.length - 1; i++) {
                    while(size < str.length - 1 && str[size].equals(str[size + 1].substring(0,str[size].length() - 1))){
                        size++;
                    }
                    System.out.println("mkdir -p " + str[++size]);
                }
            }else {
                System.out.println();
            }
            if(size != str.length - 1){
                System.out.println("mkdir -p " + str[++size]);
            }
        }
    }

    //数据库连接池
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = Integer.parseInt(sc.nextLine());
            String[] str = new String[n];
            for(int i = 0; i < n; i++){
                str[i] = sc.nextLine();
            }
            //记录最大值
            int max = 0;
            //计数
            int count = 0;
            for(int i = 0; i < str.length; i++){
                if(str[i].charAt(2) == 'c'){
                    count++;
                    max = Math.max(max,count);
                }else{
                    if(str[i].charAt(2) == 'd'){
                        count--;
                        max = Math.max(max,count);
                    }
                }
            }
            max = Math.max(max,count);
            System.out.println(max);
        }
    }
}
