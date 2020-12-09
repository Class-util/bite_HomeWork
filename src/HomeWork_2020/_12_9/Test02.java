package HomeWork_2020._12_9;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2020 12 09
 * Time:22:56
 */
public class Test02 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int[] transform = transform(arr);
        System.out.println(Arrays.toString(transform));
    }
    public static int[] transform(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            nums[i] = 2 * nums[i];
        }
        return nums;
    }
}
