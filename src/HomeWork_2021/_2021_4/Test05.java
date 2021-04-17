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
        func1();
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
