package HomeWork_2020._12_6;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2020 12 06
 * Time:23:31
 */
public class Test09 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        System.out.println( fib(n));
    }
    public static int fib(int x){
        if(x==1 ){
            return 1;
        }else if(x==2){
            return 2;
        }else{
            return fib(x-1)+fib(x-2);
        }
    }
}
