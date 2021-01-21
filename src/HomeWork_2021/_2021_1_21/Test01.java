package HomeWork_2021._2021_1_21;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2021 01 21
 * Time:22:39
 */
public class Test01 {
    public static void main(String[] args) {
        int[][] arr = {{1,3},{1,4},{2,3},{2,4},{4,3}};
        int judge = findJudge(4, arr);
        System.out.println(judge);
    }
    public static int findJudge(int N, int[][] trust) {
        int[] agree = new int[N + 1];
        for (int i = 0; i < trust.length; i++) {
            agree[trust[i][1]]++;
            agree[trust[i][0]]--;
        }
        int judge = -1;
        for (int i = 1; i < agree.length; i++) {
            if(agree[i] == N - 1){
                judge = i;
                break;
            }
        }
        return judge;
    }
}
