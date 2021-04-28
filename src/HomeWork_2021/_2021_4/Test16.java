package HomeWork_2021._2021_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2021 04 28
 * Time:20:14
 */
public class Test16 {

    //扑克牌大小
    public static String poker = "345678910JQKA2jokerJOKER";
    public static void main(String[] args) throws Exception {
        Scanner jin = new Scanner(System.in);
        while(jin.hasNext()) {
            String s = jin.nextLine();
            if(s.contains("joker JOKER")) {
                System.out.println("joker JOKER");
            }else {
                String[] str = s.split("-");
                String[] left = str[0].split(" ");
                String[] right = str[1].split(" ");
                if(left.length == 4 && right.length != 4) {
                    System.out.println(str[0]);
                }else if(left.length != 4 && right.length == 4) {
                    System.out.println(str[1]);
                }else if(left.length == right.length) {
                    String larger = poker.indexOf(left[0]) > poker.indexOf(right[0]) ? str[0] : str[1];
                    System.out.println(larger);
                }else {
                    System.out.println("ERROR");
                }
            }
        }
    }


    public static void main1(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int num = sc.nextInt();
            int ret = count(num);
            System.out.println(ret);
        }
    }

    //完全数计算
    public static int count(int n){
        int count = 0;
        while( n != 0){
            if(isNum(n)){
                count++;
            }
            n--;
        }
        return count;
    }
    public static boolean isNum(int num){
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < num; i++) {
            if(num%i == 0){
                if(!list.contains(i)){
                    list.add(i);
                }
            }
        }
        int count = 0;
        for (Integer integer : list) {
            count += integer;
        }
        return count == num ? true : false;
    }
}
