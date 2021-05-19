package HomeWork_2021._2021_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2021 05 19
 * Time:20:39
 */
public class Test10 {

    //猴子分桃
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = 0;
        while(sc.hasNext()){
            n = sc.nextInt();
            if(n == 0)
                break;
            long a = (long)Math.pow(5, n);
            long b = (long)Math.pow(4, n);
            System.out.println((a - 4) + " " + (b - 4 + n));
        }
    }

    //奇数位都为奇数或者偶数位都为偶数
    public static void main1(String[] args) {
        int[] arr = {5,1,6,3,8};
        oddInOddEvenInEven(arr);
    }
    public static void oddInOddEvenInEven(int[] arr) {
        if(arr==null || arr.length<2){
            return;
        }
        int even=0;
        int odd=1;
        int end=arr.length-1;
        while(even <=end && odd<=end){
            if(arr[end]%2==0){
                swap(arr,end,even);
                even += 2;
            }else{
                swap(arr,end,odd);
                odd += 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[]array,int i,int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


    public static void oddInOddEvenInEven1(int[] arr) {
        boolean b = false;
        if(arr[arr.length - 1] %2 == 0){
            b = true;
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0){
                list.add(arr[i]);
            }
        }
        int size1 = list.size();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0){
                list.add(arr[i]);
            }
        }
        //将元素防放入数组中
        int count2 = 0;
        for (int i = 1; i < arr.length; i = i + 2) {
            arr[i] = list.get(size1 + count2);
            count2++;
        }
        int count1 = 0;
        for (int i = 0; i < arr.length; i = i + 2) {
            arr[i] = list.get(count1);
            count1++;
        }
        if(arr.length %2 != 0){
            if(b){
                arr[arr.length - 1] = list.get(size1 - 1);
            }else {
                arr[arr.length - 1] = list.get(list.size() - 1);
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
