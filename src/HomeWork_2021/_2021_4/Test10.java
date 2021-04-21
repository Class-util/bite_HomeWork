package HomeWork_2021._2021_4;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2021 04 21
 * Time:20:15
 */
public class Test10 {
    //机器人走方格|
    public int countWays(int x, int y) {
        // write code here
        if(x == 1 || y == 1)
            return 1;
        return countWays(x-1,y) + countWays(x,y-1);
    }

    //Fibonacci数列
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int num = 0;
        while (true){
            num = a + b;
            b = a;
            a = num;
            if(n < num){
                System.out.println(Math.min(Math.abs(n-b),Math.abs(n-a)));
                break;
            }
        }
    }


    //public final static native int w;
    //abstract double b ;
    //default String s;
    //abstract final double hyou();
    //abstract double b;
    public static void main1(String[] args) {
        /*Object object = new Object(){
            @Override
            public boolean equals(Object obj) {
                return true;
            }
        };
        System.out.println(object.equals("Fred"));*/
        StringBuilder a = new StringBuilder("A");
        StringBuilder b = new StringBuilder("B");
        func(a,b);
        System.out.println(a + "," + b);
        Test10 test10 = new Test10();
        System.out.println(test10.add(9,34));
        byte b1 = 1,b2=2,b3,b6;
        final byte b4 = 4,b5 = 6;
        b6 = b4 + b5;
        b3 = (byte) (b1 + b2);
        System.out.println(b3 + b6);
        try {
            int i = 100/0;
            System.out.println(i);
        }catch (Exception e){
            System.out.println(1);
            throw new RuntimeException();
        }finally {
            System.out.println(2);
        }
        System.out.println(3);
    }
    public static void func(StringBuilder x,StringBuilder y){
        x.append(y);
        y = x;
    }
    public int add(int a,int b){
        try {
            System.out.println("123");
            return a+b;
        }catch (Exception e){
            System.out.println("catch");
        }finally {
            System.out.println("finally");
        }
        return 0;
    }
}
