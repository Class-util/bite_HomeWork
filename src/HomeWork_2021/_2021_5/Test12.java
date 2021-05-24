package HomeWork_2021._2021_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2021 05 24
 * Time:20:56
 */
public class Test12 {

    public static void main(String[] args) {
        System.out.println(3331 % 7 + " " + ((3331-(3331%7))/7));
    }

    //分解因数
    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int num = sc.nextInt();
            //拼接输出对象
            StringBuilder str = new StringBuilder(String.format("%d =", num));
            int count = num;
            for (int i = 2; i <= Math.sqrt(count); i++) {
                while (num % i == 0){
                    str.append(String.format(" %d *", i));
                    num = num / i;
                }
                if(num == 1)
                    break;
            }
            if(num != 1){
                str.append(String.format(" %d", num));
            }
            if(str.charAt(str.length() - 1) == '*'){
                str.deleteCharAt(str.length() - 1);
                str.deleteCharAt(str.length() - 1);
            }
            System.out.println(str);
        }
    }

    //分解因数(会超时)
    public static void main1(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int num = sc.nextInt();
            //使用List存储
            ArrayList<Integer> list = new ArrayList<>();
            int flog = 1;
            //找到所有因数
            for (int i = 1; i <= num; i++) {
                for (int j = num; j >= 1 ; j--) {
                    if(flog == num){
                        break;
                    }
                    if(i * j == num){
                        //判断i是否为素数
                        if(checkNum(i)){
                            list.add(i);
                            flog *= i;
                            if(flog == num){
                                break;
                            }
                        }
                        //判断j是否为素数
                        if(checkNum(j)){
                            list.add(j);
                            flog *= j;
                            if(flog == num){
                                break;
                            }
                        }
                    }
                }
            }
            //对集合进行排序
            list.sort((o1,o2) -> o1 - o2);
            //拼接输出对象
            StringBuilder str = new StringBuilder(String.format("%d = ", num));
            for(int i = 0;i <= list.size() - 1; i++){
                if(i != list.size() - 1){
                    str.append(String.format("%d * ", list.get(i)));
                }else{
                    str.append(String.format("%d", list.get(i)));
                }
            }
            System.out.println(str);
        }
    }
    //判断数字是否为素数
    public static boolean checkNum(int num){
        if(num == 1){
            return false;
        }
        if(num == 2){
            return true;
        }
        for(int i = 2;i < num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
