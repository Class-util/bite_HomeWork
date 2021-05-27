package HomeWork_2021._2021_5;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2021 05 27
 * Time:14:09
 */
public class Test15 {
    //养兔子
    static long[] arr = new long[100];
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int num = sc.nextInt();
            func();
            System.out.println(arr[num]);
        }
    }
    public static void func(){
        arr[1] = 1;
        arr[2] = 2;
        for(int i = 3; i < arr.length; i++){
            arr[i] = arr[i - 1] + arr[i - 2];
        }
    }

    //收件人列表
    public static void main1(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            String[] str = new String[n + 1];
            for(int i = 0; i <= n; i++){
                str[i] = sc.nextLine();
            }
            //输出的循环
            for(int i = 0; i < str.length; i++){
                //判断是否为空格
                if("".equals(str[i])){
                    continue;
                }
                //判断字符串中是否含有逗号或空格
                if(str[i].contains(",") || str[i].contains(" ")){
                    //说明包含,添加引号
                    str[i] = "\"" + str[i] + "\"";
                }
                if(i == str.length - 1){
                    System.out.println(str[i]);
                }else{
                    System.out.print(str[i] + ", ");
                }
            }
        }
    }
}
