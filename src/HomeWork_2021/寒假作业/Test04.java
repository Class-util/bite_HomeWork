package HomeWork_2021.寒假作业;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2021 03 24
 * Time:19:25
 */
public class Test04 {

    public static void main(String[] args) {
        int[] num1 = {9,8,7,};
        int[] num2 = {6,5,4};
        merge(num1,3,num2,3);
    }

    //合并两个有序数组
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        /*ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            list.add(nums1[i]);
        }
        for (int i = 0; i < n; i++) {
            list.add(nums2[i]);
        }
        list.sort((o1, o2) -> o1 - o2);
        System.out.println(list);*/
        for (int i = 0; i < m; i++) {
            nums1[i] = nums1[i];
        }
        for (int i = 0; i < n; i++) {
            nums1[m+i] = nums2[i];
        }
        Arrays.sort(nums1);
    }

    //最后一个单词的长度
    public int lengthOfLastWord(String s) {
        //获取字符串的长度
        int end = s.length() -1;
        //从最后一位起开始判断，如果遇到空格则将end前移，相当于跳过空格的操作
        while (end > 0 && s.charAt(end) == ' ')
            end--;
        //代码执行至此相当于末尾的空格都走完了
        //判断此时的end是否>0，如果小于0说明不存在最后一个单词
        if(end < 0)
            return 0;
        int count = 0;
        for (int i = end; i >= 0; i--) {
            //如果没有遇到空格，则一直计数
            if(s.charAt(i) != ' ')
                count++;
            //遇到空格则说明最后一个单词已经计数完，跳出即可
            else
                break;
        }
        return count;
    }
}
