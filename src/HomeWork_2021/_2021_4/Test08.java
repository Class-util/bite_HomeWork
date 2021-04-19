package HomeWork_2021._2021_4;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2021 04 19
 * Time:20:45
 */
public class Test08 {
    public static void main(String[] args) {
        topK();
    }

    //删数
    public static void func(){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n > 1000) {
                n = 999;
            }
            List<Integer> list = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                list.add(i);
            }
            int i = 0;
            while (list.size() > 1) {
                i = (i + 2) % list.size();
                list.remove(i);
            }
            System.out.println(list.get(0));
        }
    }



    //n个数里最小的k个
    public static void topK(){
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while (sc.hasNextInt()){
            list.add(sc.nextInt());
        }
        int k = list.get(list.size() - 1);
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(k,((o1, o2) -> o2-o1));
        for (int i = 0; i < list.size() - 1; i++) {
            if(maxHeap.size() < k){
                maxHeap.offer(list.get(i));
            }else {
                Integer top = maxHeap.peek();
                if(top != null){
                    if(list.get(i) < top){
                        maxHeap.poll();
                        maxHeap.offer(list.get(i));
                    }
                }
            }
        }
        ArrayList<Integer> arr = new ArrayList<>();
        while (!maxHeap.isEmpty()){
            arr.add(maxHeap.poll());
        }
        arr.sort((o1, o2) -> o1-o2);
        for (int i = 0; i < arr.size(); i++) {
            if(i == arr.size() - 1){
                System.out.println(arr.get(i));
            }else {
                System.out.println(arr.get(i) + " ");
            }
        }
    }
}
