package HomeWork_2021.寒假作业;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2021 01 19
 * Time:23:05
 */
public class Test01 {
    public static void main(String[] args) {
        /*int x = 20;
        int y = 5;
        System.out.println(x+y + "" + (x+y) +y);
        Test01.sleep();
        mystery(1234);*/
        String str = toLowerCase("fehwuhuJJHGRUEVNJFE");
        System.out.println(str);
        int[] arr = {-1,-100,3,99};
        rotate(arr,2);
        System.out.println(Arrays.toString(arr));
    }
    public static void sleep(){

    }
    public static void mystery (int x) {
        System.out.print(x % 10);
        if ((x / 10) != 0){
            mystery(x / 10);
        }
        System.out.print(x % 10);
    }
    public static String toLowerCase(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] >= 65 && chars[i] <= 90){
                chars[i] = (char) (chars[i] + 32);
            }
        }
        return new String(chars);
    }
    public static void rotate(int[] nums, int k) {
        k %= nums.length;
        Changes(nums, 0, nums.length - 1);
        Changes(nums, 0, k - 1);
        Changes(nums, k, nums.length - 1);
    }
    public static int[] Changes(int[] chars , int left , int right){
        while(left <= right){
            int tmp = chars[left];
            chars[left] = chars[right];
            chars[right] = tmp;
            left++;
            right--;
        }
        return chars;
    }
}
