package HomeWork_2021._2021_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2021 04 24
 * Time:11:54
 */
public class Test12 {
    public static void main(String[] args) {
        func();
    }

    //二进制插入
    public int binInsert(int n, int m, int j, int i) {
        // write code here
        int put = m << j;//signed left shift
        int res = n|put;
        return res;
    }

    //查找组成一个偶数最接近的两个素数
    public static void func(){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            List<int[]> list = new ArrayList<>();

            for(int i = 0; i <= n; i++){
                for(int j = 0; j <= n; j++){
                    if(i + j == n){
                        if(isPrime(i) && isPrime(j)){
                            int[] arr = {i,j};
                            list.add(arr);
                        }
                    }
                }
            }
            //找到差值最小的
            int min = Math.abs(list.get(0)[0] - list.get(0)[1]);
            int tmp;
            int flog = 0;
            for (int i = 0; i < list.size(); i++) {
                tmp = Math.abs(list.get(i)[0] - list.get(i)[1]);
                if(tmp <= min){
                    min = tmp;
                    flog = i;
                }
            }
            System.out.println(list.get(flog)[1]);
            System.out.println(list.get(flog)[0]);
        }
    }

    private static boolean isPrime(int num){
        for (int i = 2; i < num; i++) {
            if(num%i==0)
                return false;
        }
        return true;
    }

}
