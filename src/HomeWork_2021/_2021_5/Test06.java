package HomeWork_2021._2021_5;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2021 05 10
 * Time:21:54
 */
public class Test06 {
    public static void main(String[] args) {

    }
    //二维数组中的查找
    public static  boolean Find(int target, int [][] array) {
        if(array.length == 0)
            return false;
        for (int i = 0; i < array.length; i++) {
            if(array[i].length != 0){
                for (int j = 0; j < array[i].length; j++) {
                    if(array[i][j] == target)
                        return true;
                }
            }else{
                continue;
            }
        }
        return false;
    }
    //斐波那契数列
    public static int Fibonacci(int n) {
        int i = 0;
        int j = 1;
        if(n == 0)
            return 0;
        while(n - 1 > 0){
            int tmp = j;
            j = j + i;
            i = tmp;
            n--;
        }
        return j;
    }
}
