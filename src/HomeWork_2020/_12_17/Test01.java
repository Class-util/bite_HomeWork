package HomeWork_2020._12_17;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2020 12 17
 * Time:15:56
 */
public class Test01 {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        fun(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void fun(int[] nums){
        int i = 0;
        while (i != nums.length){
            for (int j = i; j < nums.length; j++) {
                if(nums[i] > nums[j]){
                    int flog = nums[i];
                    nums[i] = nums[j];
                    nums[j] = flog;
                }
            }
            i++;
        }
    }
}
