package HomeWork_2021._2021_5;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2021 05 20
 * Time:20:13
 */
public class Test11 {

    public static void main(String[] args) {

    }

    //求正整数数组的最小不可组成
    public static int getFirstUnFormedNum(int[] arr) {
        //寻找数组元素的最小值
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        //将数组元素相加，求出最大值
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            max += arr[i];
        }
        //[min,max]范围的每个数字去查找
        int ret = 0;

        return ret;
    }
    //有假币
}
