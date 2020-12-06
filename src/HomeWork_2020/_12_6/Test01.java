package HomeWork_2020._12_6;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2020 12 06
 * Time:22:54
 */
public class Test01 {
    public static void main(String[] args) {
        int[] arr = {2,2,1};
        int i = singleNumber(arr);
        System.out.println(i);
    }
    public static int singleNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int sign = 0;
            for (int j = 0; j < nums.length; j++) {
                if(nums[i]==nums[j]){
                    sign++;
                }
            }
            if(sign!=2){
                return nums[i];
            }
        }
        return 0;
    }
}
