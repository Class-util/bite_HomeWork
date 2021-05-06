package HomeWork_2021._2021_5;


import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2021 05 06
 * Time:19:19
 */
public class Test01 {

    public static void main(String[] args) {
        AddLongInteger("123","8");
    }

    //超长正整数相加
    public static String AddLongInteger(String addend,String augend){
        StringBuilder res = new StringBuilder();
        // 进位信息
        int carry = 0;
        int i = addend.length() - 1, j = augend.length() - 1;
        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry;
            if (i >= 0) {
                sum += addend.charAt(i--) - '0';
            }
            if (j >= 0) {
                sum += augend.charAt(j--) - '0';
            }
            res.append(sum % 10);
            carry = sum / 10;
        }
        return res.reverse().toString();
    }

    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int num = findNum(n);
            System.out.println(num);
        }
    }

    //杨辉三角形的变形
    public static  int findNum(int n){
        //构建杨辉三角形
        //存储整个杨辉三角形序列
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> first = new ArrayList<>();
        first.add(1);
        list.add(first);
        ArrayList<Integer> init = new ArrayList<>();
        //添加第一行元素
        init.add(1);
        init.add(1);
        init.add(1);
        list.add(init);
        //创建杨辉三角形
        for (int i = 1; i < n - 1; i++) {
            //存储每一行的数字
            ArrayList<Integer> line = new ArrayList<>();
            line.add(1);
            for (int j = 0; j < list.get(i).size(); j++) {
                //计算
                if (j == 0) {
                    line.add(list.get(i).get(j) + list.get(i).get(j + 1));
                } else {
                    if (j == list.get(i).size() - 1) {
                        line.add(list.get(i).get(j - 1) + list.get(i).get(j));
                    } else {
                        line.add(list.get(i).get(j - 1) + list.get(i).get(j) + list.get(i).get(j + 1));
                    }
                }


            }
            line.add(1);
            list.add(line);
        }
        //System.out.println(list);
        //找到最后一行数组中的第一个偶数
        ArrayList<Integer> last = list.get(list.size() - 1);
        for (int i = 0; i < last.size(); i++) {
            if (last.get(i) % 2 == 0) {
                return i + 1;
            }
        }
        return -1;
    }
}
