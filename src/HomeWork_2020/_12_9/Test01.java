package HomeWork_2020._12_9;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2020 12 09
 * Time:22:49
 */
public class Test01 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        double avg = avg(arr);
        int sum = sum(arr);
        System.out.println(sum);
    }
    public static double avg(int[] nums){
        double num = 0;
        int len = nums.length;
        for (int j : nums) {
            num += j;
        }
        return num / len;
    }
    public static int sum(int[] nums){
        int num = 0;
        for (int i : nums) {
            num += i;
        }
        return num;
    }
}
