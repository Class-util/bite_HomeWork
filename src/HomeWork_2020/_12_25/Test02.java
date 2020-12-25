package HomeWork_2020._12_25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2020 12 25
 * Time:16:43
 */
public class Test02 {
    public static void main(String[] args) {
        int[] arr1 = {2,3,5};
        int[] arr2 = {2,4,6};
        fun(arr1,arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
    public static void fun(int[] num1,int[] num2){
        int tmp = 0;
        for (int i = 0; i < num1.length; i++) {
            tmp = num1[i];
            num1[i] = num2[i];
            num2[i] = tmp;
        }
    }
}
