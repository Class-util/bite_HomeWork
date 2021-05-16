package HomeWork_2021._2021_5;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2021 05 16
 * Time:19:59
 */
public class Test09 {
    //数根
        public static void main(String[] args){
            Scanner scanner=new Scanner(System.in);
            while(scanner.hasNext()){
                String str=scanner.next();
                while(str.length()>1){
                    int result=0;
                    for(int i=0;i<str.length();i++)
                        result+=str.charAt(i)-'0';
                    str=String.valueOf(result);
                }
                System.out.println(str);
            }
        }

    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int num = sc.nextInt();
            //一位数的情况
            if(num <= 9){
                System.out.println(num);
            }else {
                //多位数情况
                while(num >= 9){
                    StringBuilder sb = new StringBuilder(num + "");
                    int ret = 0;
                    for (int i = 0; i < sb.length(); i++) {
                        ret += Integer.parseInt(sb.charAt(i) + "");
                    }
                    num = ret;
                }
                System.out.println(num);
            }
        }
    }
}
