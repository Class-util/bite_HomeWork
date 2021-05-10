package HomeWork_2021._2021_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2021 05 10
 * Time:20:22
 */
public class Test05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            int commonStrLength = getCommonStrLength(s1, s2);
            System.out.println(commonStrLength);
            /*
            asdfas
            werasdfaswer
            */
        }
    }
    //公共子串计算
    public static int getCommonStrLength(String pFirstStr,String pSecondStr){
        //保证第一个字符串始终是较短的那个
        if(pFirstStr.length() > pSecondStr.length()){
            String tmp = pFirstStr;
            pFirstStr = pSecondStr;
            pSecondStr = tmp;
        }
        int max = 0;
        for (int i = 0; i < pFirstStr.length(); i++) {
            //j取等好的原因是：区域是左闭右开的需要多走一位
            for (int j = i + 1; j <= pFirstStr.length(); j++) {
                String str = pFirstStr.substring(i,j);
                if(pSecondStr.contains(str)){
                    if(max < str.length()){
                        max = str.length();
                    }
                }
            }
        }
        return max;
    }
}
