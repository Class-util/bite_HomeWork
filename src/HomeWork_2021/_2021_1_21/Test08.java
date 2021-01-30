package HomeWork_2021._2021_1_21;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2021 01 30
 * Time:17:53
 */
public class Test08 {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> que = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (int stone : stones) {
            que.add(stone);
        }
        while(que.size() > 1){
            int x = que.poll();
            int y = que.poll();
            if(x > y){
                que.add(x - y);
            }
        }
        return que.isEmpty() ? 0 : que.poll();
    }
}
