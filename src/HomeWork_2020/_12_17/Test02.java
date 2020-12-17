package HomeWork_2020._12_17;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2020 12 17
 * Time:16:07
 */
public class Test02 {
    public static void main(String[] args) {
        int[] arr = {1,2,5,4,3};
        boolean fun = fun(arr);
        System.out.println(fun);
    }
    public static boolean fun(int[] nums){
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i] > nums[i+1])
                return false;
        }
        return true;
    }
}
