package HomeWork_2021._2021._1._2021_1_21;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2021 01 24
 * Time:16:30
 */
public class Test03 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int k = 1;
        List<List<Integer>> lists = shiftGrid(arr,k);
        System.out.println(lists);
    }
    public static List<List<Integer>> shiftGrid(int[][] grid, int k) {
        while (k > 0){
            //创建辅助二维数组
            int[][] arr = new int[grid.length][grid[0].length];
            //根据题目的操作一步一步来
            //操作一
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length-1; j++) {
                    arr[i][j+1] = grid[i][j];
                }
            }
            //操作二
            for (int i = 0; i < grid.length - 1; i++) {
                arr[i+1][0] = grid[i][grid[0].length-1];
            }
            //操作三
            arr[0][0] = grid[grid.length-1][grid[0].length-1];
            grid = arr;
            k--;
        }
        //创建集合
        List<List<Integer>> ret = new ArrayList<>();
        for (int[] row : grid) {
            List<Integer> list = new ArrayList<>();
            ret.add(list);
            for (int i : row){
                list.add(i);
            }
        }
        return ret;
    }
}
