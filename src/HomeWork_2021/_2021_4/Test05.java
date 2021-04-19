package HomeWork_2021._2021_4;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2021 04 17
 * Time:14:33
 */
public class Test05 {
    public static void main(String[] args) {
        func2();
    }


    public static void myFun(){
        Scanner sc = new Scanner(System.in);
        //n个数字
        int n = sc.nextInt();
        //使用arrayList存储数字，一个为数字集，一个为计数集
        List<Integer> list = new ArrayList();
        List<Integer> ret = new ArrayList();
        //存储数字
        for(int i = 0; i < n; i++){
            list.add(sc.nextInt());
        }
        //从小到大进行排序
        list.sort((o1,o2) -> o1-o2);
        int j = 0;
        //记录数字出现几次
        int flog = 0;
        int num = list.get(0);
        while(j < n){
            //开始进行比较
            //因为排完序，所以直接比较，相邻有相同的就flog++
            while(j < n && num == list.get(j)){
                flog++;
                j++;
            }
            //执行至此，说明已经将该数字出现的次数记录完，判断是奇数还是偶数
            if(flog % 2 == 1){
                //为奇数，则添加进行ret集合，注意是在j-1和j不相同循环才结束的，我们要添加的是j-1位置的元素，j还没有开始自己的计数
                ret.add(list.get(j - 1));
            }
            //如果j<n说明数字还没比较晚
            if(j < n){
                //将j位置的数字记录下，开始计数循环
                num = list.get(j);
            }
            flog = 0;
        }
        //明确只有两个这样的数字，直接定性输出即可
        System.out.println(ret.get(0) + " " + ret.get(1));
    }


    //数组中值出现了一次的数字
    public static void func2(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        int n = scanner.nextInt();
        for(int i = 0;i < n;i++) {
            arrayList.add(scanner.nextInt());
        }
        Collections.sort(arrayList);
        int a = arrayList.get(0);
        int flag = 0;
        int j = 0;
        while(j < n) {
            while (j < n && a == arrayList.get(j)) {
                flag++;
                j++;
            }
            if(flag % 2 == 1) {
                result.add(arrayList.get(j - 1));
            }
            if(j < n) {
                a = arrayList.get(j);
            }
            flag = 0;
        }
        System.out.println(result.get(0) + " " + result.get(1));
    }

    public static void func1(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        if(arr.length == 0){
            System.out.println("");
            return ;
        }
        if(arr.length == 1){
            System.out.println(arr[0]);
            return ;
        }
        Arrays.sort(arr);
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] == arr[i + 1]){
                count++;
            }else {
                if(count % 2 == 1){
                    System.out.print(arr[i + 1] + " ");
                    count = 0;
                }
            }
        }
    }

    public static void func(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count % 2 == 1){
                if(!list.contains(arr[i])){
                    list.add(arr[i]);
                }
            }
        }
        list.sort((o1, o2) -> o1-o2);
        for (int i = 0; i < list.size(); i++) {
            if(i == list.size() - 1){
                System.out.print(list.get(i));
            }else {
                System.out.print(list.get(i) + " ");
            }
        }
    }
}
