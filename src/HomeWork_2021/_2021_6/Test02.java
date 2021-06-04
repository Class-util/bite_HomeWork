package HomeWork_2021._2021_6;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2021 06 04
 * Time:19:01
 */
public class Test02 {
    //Emacs计算器
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Stack<Integer>stack=new Stack<>();
        while(scanner.hasNext()){
            int n=scanner.nextInt();
            String string[]=new String[n];
            for (int i = 0; i < n; i++) {
                string[i]=scanner.next();
                if (string[i].charAt(0)>='0'&&string[i].charAt(0)<='9') {
                    stack.push(Integer.parseInt(string[i]));
                }else{
                    int a2=stack.pop();
                    int a1=stack.pop();
                    if (string[i].charAt(0)=='+') {
                        stack.push(a1+a2);
                    }
                    if (string[i].charAt(0) == '-') {
                        stack.push(a1-a2);
                    }
                    if (string[i].charAt(0) == '*') {
                        stack.push(a1*a2);
                    }
                    if (string[i].charAt(0) == '/') {
                        stack.push(a1/a2);
                    }
                }
            }
            System.out.println(stack.pop());
        }
    }

    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        while(sc.hasNext()){
            int n = sc.nextInt();
            String[] str = new String[n];
            for (int i = 0; i < n; i++) {
                str[i] = sc.next();
                if(str[i].charAt(0) >= '0' && str[i].charAt(0) <= '9'){
                    stack.push(Integer.parseInt(str[i]));
                }else {
                    int num2 = stack.pop();
                    int num1 = stack.pop();
                    if ("+".equals(str[i])) {
                        stack.push(num1+num2);
                    }
                    if ("-".equals(str[i])) {
                        stack.push(num1 - num2);
                    }
                    if ("*".equals(str[i])) {
                        stack.push(num1 * num2);
                    }
                    if ("/".equals(str[i])) {
                        stack.push(num1 / num2);
                    }
                }
            }
            System.out.println(stack.pop());
        }
    }
}
