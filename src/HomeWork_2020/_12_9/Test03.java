package HomeWork_2020._12_9;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2020 12 09
 * Time:23:00
 */
public class Test03 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,8};
        printArray(arr);
    }
    public static void printArray(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            if(i != nums.length-1){
                System.out.print("num[" + i + "]=" + nums[i] + " ");
            }else {
                System.out.print("num[" + i + "]=" + nums[i]);
            }
        }
    }
}
