package HomeWork_2020._12_25;

import java.util.Arrays;

/**
 *Created with IntelliJ IDEA.
 *Description:
 *User:吴博
 *Date:2020 12 25
 *Time:15:32
 */
public class Test01 {
    public static void main(String[] args) {
        int[] arr = {1,3,5,2,4,6};
        fun(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void fun(int[] nums){
        int i = 0;
        int j = nums.length - 1;
        while (i <= j){
            if(nums[j] % 2 == 0){
                int sign = nums[i];
                nums[i] = nums[j];
                nums[j] = sign;
            }
            i++;
            j--;
        }
    }
}
