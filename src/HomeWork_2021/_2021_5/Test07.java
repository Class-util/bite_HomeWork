package HomeWork_2021._2021_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2021 05 11
 * Time:20:34
 */
public class Test07 {

    //洗牌
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// 使用Scanner来获取键盘输入

        // 第一次输入的是T
        // T：要洗牌的牌组数量
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            // 第二次输入的是n和k
            // n：2n即牌的数量
            // k：洗牌的次数
            int n = scanner.nextInt();
            int k = scanner.nextInt();

            // 获得牌组cards，并分成两堆cards1和cards2
            ArrayList<Integer> cards = new ArrayList<>();
            ArrayList<Integer> cards1 = new ArrayList<>();
            ArrayList<Integer> cards2 = new ArrayList<>();

            // 获得牌组cards所有数
            for (int j = 0; j < 2 * n; j++) {
                cards.add(scanner.nextInt());
            }
            Collections.reverse(cards);// 将牌组顺序翻转，便于洗牌

            for (int x = 0; x < k; x++) {
                cards1.clear();
                cards2.clear();

                //将下半堆放入cards1
                for (int j = 0; j < n; j++) {
                    cards1.add(cards.get(j));
                }

                // 将上半堆放入cards2
                for (int j = n; j < 2 * n; j++) {
                    cards2.add(cards.get(j));
                }

                // 洗牌过程
                cards.clear();
                for (int j = 0; j < n; j++) {
                    cards.add(cards1.get(j));
                    cards.add(cards2.get(j));
                }
            }

            Collections.reverse(cards);// 再把牌组顺序反转为正常顺序
            System.out.println(
                    cards.toString()
                            .replace("[", "")
                            .replace("]", "")
                            .replace(",", ""));
        }

        scanner.close();
    }

    //MP3光标位置
    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int num = sc.nextInt();
            String str = sc.next();
            //当前列表顶点的位置
            int top = 1;
            //光标所处位置
            int index = 1;
            for(int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == 'U') {
                    //如果光标位置和顶点位置重合
                    if(top == index) {
                        //判断顶点是否为1，为1则需要去到num那页，不然-1即可
                        top = top == 1 ? num - 3 : top - 1;
                    }
                    //移动光标，index如果为1，需要跳转最后一页，变为num，不然-1即可
                    index = (index == 1) ? num : index - 1;
                } else if(str.charAt(i) == 'D') {
                    //如果光标所处位置为当页最后一个
                    if(top + 3 == index) {
                        //如果index处于num最后一个，则顶点需要变成1开头，不然+1即可
                        top = index == num ? 1 : top + 1;
                    }
                    //移动光标，如果光标处于num出，则需要变为1，不然+1即可
                    index = index == num ? 1 : index + 1;
                }
            }
            //如果歌曲本身不构成一页，需要将头重置为1
            if(num < 4){
                top = 1;
            }
            //输出四个歌曲的同时，要判断是否数值会超过num本身，因为num可以小于4
            for(int i = 0; i < 3 && i < num - 1; i++) {
                System.out.print(top + i + " ");
            }
            //如果num < 4 则最后一个数要变为num-1，大于4则top+3为最后一位
            System.out.println(top + (4 > num ? (num - 1) : 3));
            System.out.println(index);
        }
    }

    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            String str = sc.next();
            int count = 1;
            //循环字符串长度次
            int len = str.length();
            //计算最终走了多少
            for(int i = 0;i < len ; i++){
                if(str.charAt(i) == 'U'){
                    count--;
                }else {
                    count++;
                }
            }
            //判断如果大于n和小于0的情况
            if(count < 0){
                //加到count大于0
                while (count < 0){
                    count = count + n;
                }
            }else {
                count = n % count;
            }
           //列表歌曲
        }
    }
}
