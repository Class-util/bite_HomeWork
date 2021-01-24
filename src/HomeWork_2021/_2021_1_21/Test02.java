package HomeWork_2021._2021_1_21;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2021 01 21
 * Time:23:01
 */
public class Test02 {
    public static void main(String[] args) {
        int[] arr = {10,-10,10,-10,10,-10,10,-10};
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
            //一进来，就计算和
            num += i;
            //判断和是否为目标值
            if(num == count){
                flog++;
                num = 0;
            }
        }
        //System.out.println(flog);
        return flog >= 3;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ret = new ArrayList<>();
        if(numRows <= 0) return ret;
        //第一行的list
        List<Integer> list = new ArrayList<>();
        list.add(1);
        //把第一行的list放到ret当中
        ret.add(list);
        for(int i = 1;i < numRows;i++) {
            List<Integer> curRow = new ArrayList<>();
            curRow.add(1);
            for(int j = 1 ;j < i;j++) {
                //确定的是当前行的每个元素  ==  上一行的当前列+上一行的前一列就是我当前需要添加的数字
                curRow.add(ret.get(i-1).get(j-1)+ret.get(i-1).get(j));
            }
            //手动在当前行的最后一个位置 添加一个1
            curRow.add(1);
            ret.add(curRow);
        }
        return ret;
    }
}
