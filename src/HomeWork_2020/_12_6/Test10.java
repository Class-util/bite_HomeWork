package HomeWork_2020._12_6;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2020 12 06
 * Time:23:33
 */
public class Test10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ht(n,'a','b','c');
    }
    public static void ht(int n,char a,char b,char c){
        if(n==1){
            System.out.println(a+"->"+c);
        }else{
            ht(n-1,a,c,b);
            System.out.println(a+"->"+c);
            ht(n-1,b,a,c);
        }
    }
}
