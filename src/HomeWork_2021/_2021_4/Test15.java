package HomeWork_2021._2021_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2021 04 28
 * Time:18:03
 */
public class Test15 {
    public static void main(String[] args) {
        int[] left = {0,7,1,6};
        int[] right = {1,5,0,6};
        int i = findMinimum(4,left,right);
        System.out.println(i);
    }
    public static void main1(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int ret = findNumberOf1(n);
            System.out.println(ret);
        }
    }
    //统计二进制中1的个数
    public static int findNumberOf1(int num){
        int count = 0;
        while(num != 0){
            num = (num - 1) & num;
            count++;
        }
        return count;
    }
    //手套
    public static int findMinimum(int n, int[] left, int[] right) {
        int sum = 0;
        List<Integer> leftList = new ArrayList<Integer>();
        List<Integer> rightList = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            if ((left[i] == 0 && right[i] != 0) || (left[i] != 0 && right[i] == 0)) {
                sum += left[i] + right[i];
            } else if (left[i] != 0 && right[i] != 0){
                leftList.add(left[i]);
                rightList.add(right[i]);
            }
        }
        Collections.sort(leftList);
        Collections.sort(rightList);
        int sum1 = 0, sum2 = 0;
        for (int i = leftList.size() - 1; i > 0; i--) {
            sum1 += leftList.get(i);
        }
        for (int i = rightList.size() - 1; i > 0; i--) {
            sum2 += rightList.get(i);
        }
        return Math.min(sum1, sum2) + 2 + sum;
    }
}
