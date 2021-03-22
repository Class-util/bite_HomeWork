package HomeWork_2021._2021._1._2021_1_21;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2021 01 24
 * Time:18:42
 */
public class Test05 {
    public static void main(String[] args) {
         String[] str = {"5","-2","4","C","D","9","+","+"};
        int i = calPoints(str);
        System.out.println(i);
    }
    public static int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < ops.length; i++) {
            if("C".equals(ops[i])){
                stack.pop();
                continue;
            }
            if("D".equals(ops[i])){
                int num = stack.peek();
                num *= 2;
                stack.push(num);
                continue;
            }
            if("+".equals(ops[i])){
                int a = stack.pop();
                int b = stack.pop();
                int num = a + b;
                stack.push(b);
                stack.push(a);
                stack.push(num);
                continue;
            }
            int n = Integer.parseInt(ops[i]);
            stack.push(n);
        }
        int ret = 0;
        while (!stack.isEmpty()){
            ret += stack.pop();
        }
        return ret;
    }
}
