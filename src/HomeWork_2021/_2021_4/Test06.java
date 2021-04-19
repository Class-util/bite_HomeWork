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
        Scanner scanner = new Scanner(System.in);
        int N =  scanner.nextInt();
        int[] array  = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < N ; i++) {
            toFind1(array, array[i], i);
        }
    }

    private static void toFind1(int[] array, int num, int i) {
        int left = -1;
        int right = -1;
        for (int j = i; j >= 0 ; j--) {
            if (array[j] < num) {
                left = j;
                break;
            }
        }
        for (int j = i+1; j < array.length ; j++) {
            if (array[j] < num) {
                right = j;
                break;
            }
        }
        System.out.println(left + " " + right);
    }

    public static void main1(String[] args) {
        func1();
    }

    public static void func1(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            toFind(arr,arr[i],i);
        }
    }

    private static void toFind(int[] arr, int num, int i) {
        //初始值都为-1，放便最右边和最左边的值，都会存在一个-1；
        int left = -1;
        int right = -1;
        //找到左边比他小的,向左走
        for (int j = i; j >= 0; j--) {
            if(arr[j] < num){
                left = j;
                break;
            }
        }
        //找到右边最小的值,向右走
        for (int j = i + 1; j < arr.length; j++) {
            if(arr[j] < num){
                right = j;
                break;
            }
        }
        System.out.println(left + " " + right);
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
