package HomeWork_2020._12_6;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2020 12 06
 * Time:23:13
 */
public class Test05 {
    public static void main(String[] args) {
        int[] arr = {8,4,2,6,10,1,5,3,9,7};
        int[] fun = fun(arr);
        for (int i : fun) {
            System.out.println(i);
        }
    }
    public static int[] fun(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if((i < j) && (nums[i]%2==0) && (nums[j]%2 != 0)){
                    int n = nums[i];
                    nums[i] = nums[j];
                    nums[j] = n;
                }
            }
        }
        return nums;
    }
}
