package HomeWork_2020._12_17;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2020 12 17
 * Time:16:11
 */
public class Test03 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int search = Search(arr,3);
        System.out.println(search);
    }
    public static int Search(int[] nums,int n){
        int left = 0;
        int right = nums.length - 1;
        while (left <= right){
            int mid = (left + right) / 2;
            if(n < nums[mid]){
                right = mid - 1;
            }else {
                if(n > nums[mid]){
                    left = mid + 1;
                }else
                    return mid;
            }
        }
        return -1;
    }
}
