package HomeWork_2021._2021_4;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2021 04 14
 * Time:21:53
 */
public class Test01 {
    public static void main(String[] args) {
        //func();
        func1();
    }
    //进制转换
    public static void func1(){
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,Character> hm = new HashMap<>();
        hm.put(10,'A');
        hm.put(11,'B');
        hm.put(12,'C');
        hm.put(13,'D');
        hm.put(14,'E');
        hm.put(15,'F');
        while(sc.hasNext()){
            int m = sc.nextInt();
            int n = sc.nextInt();
            StringBuilder sb = new StringBuilder();
            //用来判断是否为负数，默认正数
            boolean flag = false;
            //如果是负数，就将flog设为true，并将数字变为正数
            if(m<0){
                flag = true;
                m = 0-m;
            }
            //循环计算
            while(m>0){
                //计算余数
                int t = m%n;
                //如果余数在哈希集合中查找不到，就直接添加余数，如果找到了，就直接添加字母
                sb.append(hm.get(t) == null ? t : hm.get(t)+"");
                //计算m下一位
                m = m/n;
            }
            //如果flog为true说明数字本来为负数，输出时应加上负号，并将字符串倒置输出
            if(flag)
                System.out.println("-" + sb.reverse().toString());
            else
                System.out.println(sb.reverse().toString());
        }
    }

    //计算糖果
    public static void func(){
        Scanner sc = new Scanner(System.in);
        int x1,x2,x3,x4;
        float a = 0,b = 0,c = 0;
        while (sc.hasNextInt()){
            x1 = sc.nextInt();
            x2 = sc.nextInt();
            x3  = sc.nextInt();
            x4  = sc.nextInt();
            a = (x1 + x3)/2f;
            b = (x3 - x1)/2f;
            c = (x4 - x2)/2f;
            if(a - ((x1 + x3)/2f) != 0){
                System.out.println("No");
                return ;
            }
            if(b - ((x3 - x1)/2f) != 0 || b - (x2 + x4)/2f != 0){
                System.out.println("No");
                return ;
            }
            if(c - ((x4 - x2)/2f) != 0){
                System.out.println("No");
                return ;
            }
        }
        System.out.println((int)a + " " + (int)b + " " + (int)c);
    }
}
