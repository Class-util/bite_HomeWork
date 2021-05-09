package HomeWork_2021._2021_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2021 05 09
 * Time:21:33
 */
public class Test04 {
        public static void compare(String str1, String str2){
            String result = "";
            for (int i = 1; i < str1.length(); i++) {
                StringBuilder sb = new StringBuilder();
                for (int j = i-1; j < str1.length(); j++) {
                    if (str2.contains(sb.append(str1.charAt(j)))){
                        if (sb.length()>result.length()){
                            result = sb.toString();
                        }
                    }
                }
            }
            System.out.println(result);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            while (sc.hasNext()){
                String str1 = sc.next();
                String str2 = sc.next();
                if (str1.length() <= str2.length()){
                    compare(str1, str2);
                }else {
                    compare(str2, str1);
                }
            }
        }

        //查找两个字符串中的最长子串
    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str1 = sc.nextLine();
            String str2 = sc.nextLine();
            //保证str2始终是长度较大的那个
            if(str2.length() < str1.length()){
                String tmp = str2;
                str2 = str1;
                str1 = tmp;
            }
            String ret = "";
            for (int i = 1; i < str1.length(); i++) {
                StringBuilder sb = new StringBuilder();
                for (int j = i - 1; j < str1.length(); j++) {
                    if(str2.contains(sb.append(str1.charAt(j)))){
                        if(sb.length() > ret.length()){
                            ret = sb.toString();
                        }
                    }
                }
            }
            System.out.println(ret);
        }
    }

    //汽水瓶
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            if(n == 0)
                return ;
            int count = 0;
            while(n > 2){
                //原有的汽水瓶可以换多少个
                int water = n / 3;
                //换完后剩余瓶子数
                int flog = n % 3;
                //当前持有的瓶子数
                n = water + flog;
                //喝到的饮料数
                count += water;
            }
            if(n == 2){
                count++;
            }
            System.out.println(count);
        }
    }
}
