package HomeWork_2021._2021_1_21;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2021 01 21
 * Time:23:01
 */
public class Test02 {
    public static void main(String[] args) {
        int[] arr = {0,2,1,-6,6,-7,9,1,2,0,1};
        boolean b = canThreePartsEqualSum(arr);
        System.out.println(b);
    }
    public static  boolean canThreePartsEqualSum(int[] arr) {
        int count = 0;
        for (int i : arr) {
            count += i;
        }
        if(count % 3 != 0)
            return false;
        count = count / 3;
        //用来计算部分和
        int num = 0;
        //计算有几部分
        int flog = 0;
        for (int i : arr) {
            if(i == count){
                flog++;
            }else {
                if(num == count){
                    flog++;
                    num = 0;
                }else {
                    num += i;
                }
            }
        }
        //System.out.println(flog);
        return flog == 3;
    }
}
