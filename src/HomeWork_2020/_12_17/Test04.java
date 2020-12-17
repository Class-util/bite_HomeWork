package HomeWork_2020._12_17;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2020 12 17
 * Time:16:36
 */
public class Test04 {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6};
        int[] num = copyArray(arr);
        System.out.println(Arrays.toString(num));
    }
    public static int[] copyArray(int[] nums){
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }
        return arr;
    }
}
