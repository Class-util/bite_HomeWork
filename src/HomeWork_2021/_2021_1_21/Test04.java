package HomeWork_2021._2021_1_21;
import HomeWork_2021._2021_1_19.A;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;


/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2021 01 24
 * Time:17:35
 */
public class Test04 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.offer(4);
        System.out.println(list);
        System.out.println(list.peek());
        System.out.println(list);
        System.out.println(list.poll());
        System.out.println(list);
        System.out.println(list.pop());
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(1);
        list1.add(1);
        list1.add(1);
        System.out.println(list1);
        System.out.println(list1.get(2));
    }
    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String str : tokens) {
            switch (str) {
                case "+" -> {
                    int num = stack.pop() + stack.pop();
                    stack.push(num);
                }
                case "-" -> {
                    int tmp = stack.pop();
                    stack.push(stack.pop() - tmp);
                }
                case "*" -> stack.push(stack.pop() * stack.pop());
                case "/" -> {
                    int n = stack.pop();
                    stack.push(stack.pop() / n);
                }
                default -> stack.push(Integer.parseInt(str));
            }
        }
        return stack.pop();
    }
}
