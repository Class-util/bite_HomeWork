package HomeWork_2021._2021_4;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2021 04 19
 * Time:19:34
 */
public class Test07 {

    public static void main(String[] args) {
        func();
    }

    //最小公倍数
    public static void func(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        //始终保证a是大值
        if(a < b){
            int tmp = b;
            b = a;
            a = tmp;
        }
        for (int i = a; i <= a*b; i++) {
            if(i % a == 0 && i % b == 0){
                System.out.println(i);
                break;
            }
        }
    }

    //不要二（找规律）
    //把所有的行和列排成一行(与原来等价) 那么问题就变成了将蛋糕每隔一个空放一个 可以多少
        public static int deal(int r, int c){
            int n=0;
            if(r%4==0||c%4==0){n=r*c/2;}//如果能整除4 那么蛋糕个数为网格个数的一半
            else{ n=r*c/2+1;}//不能被4整除 将蛋糕每隔一个空放一个 可以放多少 奇数的一半+1
            return n;
        }
        public static void main1(String[] args){
            Scanner sc=new Scanner(System.in);
            while(sc.hasNext()){
                int r=sc.nextInt();
                int c=sc.nextInt();
                int res=deal(r,c);
                System.out.println(res);
            }
        }
    }
