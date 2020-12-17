package HomeWork_2020._12_17;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2020 12 17
 * Time:16:39
 */
public class Test05 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        String s = toString(arr);
        System.out.println(s);
    }
    public static String toString(int[] nums){
        String str = "[";
        for (int i = 0; i < nums.length; i++) {
            if(i != nums.length-1) {
                str += nums[i] +" ";
            }else {
                str += nums[i] + "" + ']';
            }
        }
        return str;
    }
}
