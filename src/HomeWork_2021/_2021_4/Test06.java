package HomeWork_2021._2021_4;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2021 04 17
 * Time:15:17
 */
public class Test06 {
    public static void main(String[] args) {
        func();
    }
    //单调栈结构
    public static void func(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int len = arr.length;
        int[] right = new int[len];
        int[] left = new int[len];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < len; i++) {
            while(!stack.empty() && arr[i] < arr[stack.peek()]) {
                int tempTop = stack.pop();
                left[tempTop] = stack.empty() ? -1 : stack.peek();
                right[tempTop] = i;
            }
            stack.push(i);
        }

        while(!stack.empty()) {
            int tempTop = stack.pop();
            left[tempTop] = stack.empty() ? -1 : stack.peek();
            right[tempTop] = -1;
        }

        for(int i = 0; i < len; i++) {
            System.out.println(left[i] + " " + right[i]);
        }
    }
}
