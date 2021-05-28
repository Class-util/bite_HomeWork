package HomeWork_2021._2021_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2021 05 28
 * Time:21:22
 */
public class Test16 {
    //年会抽奖
    public static void main2(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            double sum1=factorial(n);
            double sum2=count(n);
            double result=(sum2/sum1)*100; //计算成%的形式
            System.out.println(String.format("%.2f",result)+"%");
        }
    }
    //计算所有人都抽不到奖的情况：错排算法
    private static double count(int n) {
        if(n==1){
            return 0;
        }else if(n==2){
            return 1;
        }else {
            return (n-1)*(count(n-1)+count(n-2));
        }
    }

    //计算阶乘：迭代写法
    private static double factorial(int n) {
        double sum=1;
        while(n>1){
            sum=sum*n;
            n--;
        }
        return sum;
    }
    //计算阶乘：递归写法
    private  static double factorical2(int n){
        if(n==0||n==1){
            return 1;
        }
        return n*factorical2(n-1);
    }

    //抄送列表
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            String name = sc.nextLine();
            char[] ch = s.toCharArray();
            List<String> list = new ArrayList<>();
            //定义遇到引号的标志，遇到变1
            int flag = 0;
            String res = "";
            for (int i = 0; i < ch.length; i ++ ) {
                //第一次遇到引号
                if(flag == 0 && ch[i] == '"') {
                    //变为1
                    flag = 1;
                    //遇到引号，将之前的字符串存进去
                    list.add(res);
                    res = "";
                } else if(flag == 1 && ch[i] == '"') {//第二次遇到引号，标志变为0，并添加进去
                    flag = 0;
                    list.add(res);
                    res = "";
                } else if(flag == 1) {//遇到引号之后，一直拼接
                    res += ch[i];
                } else if(flag == 0 && ch[i] != ',') {//没有遇到引号，遇到了逗号，将之前的拼接字符串添加进去
                    res += ch[i];
                }
            }
            list.add(res);
            //System.out.println(list);
            boolean isFinded = false;
            for (String string:list) {
                if(name.equals(string)) {
                    isFinded = true;
                    break;
                }
            }
            if(isFinded) System.out.println("Ignore");
            else System.out.println("Important!");
        }
    }


    //抄送列表:会超时
    public static void main1(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            String name = sc.nextLine();
            //将名字分离出来
            //定义指针
            int flog = 0;
            //定义存储名字的空间
            List<String> list = new ArrayList<>();
            String username = "";
            //用来判断是否已经遇到引号了
            int sign = 0;
            while(flog < str.length()){
                //正常存储名字
                if((str.charAt(flog) >= 'A' && str.charAt(flog) <= 'Z') || (str.charAt(flog) >= 'a' && str.charAt(flog) <= 'z') || " ".equals(str.charAt(flog)+ "")){
                    username += str.charAt(flog);
                    if(flog + 1 == str.length() - 1 ){
                        break;
                    }else {
                        flog++;
                    }
                }else {
                    //如果遇到引号
                    if((str.charAt(flog) + "").equals("\"")){
                        //说明之前已经遇到引号了
                        if(sign == 1){
                            sign = 0;
                            //判断之前存储的名字是否为空
                            if(!"".equals(username)){
                                list.add(username);
                                username = "";
                            }
                            if(flog + 1 == str.length() - 1 ){
                                break;
                            }else {
                                flog++;
                            }
                        }else {
                            //之前没遇到引号
                            sign = 1;
                            if(flog + 1 == str.length() - 1 ){
                                break;
                            }else {
                                flog++;
                            }
                        }
                    }else {
                        //如果遇到逗号,先判断是否遇到引号
                        if(sign == 1){
                            username += str.charAt(flog);
                            flog++;
                        }else {
                            //判断之前存储的名字是否为空
                            if(!"".equals(username)){
                                list.add(username);
                                username = "";
                            }
                            if(flog + 1 == str.length() - 1 ){
                                break;
                            }else {
                                flog++;
                                }
                            }
                        }
                    }
                }
            username += str.charAt(++flog);
            list.add(username);
            System.out.println(list);
            int i = 0;
            for(String s : list){
                if(s.equals(name)){
                    System.out.println("Ignore");
                    i = 1;
                    break;
                }
            }
            if(i == 0){
                System.out.println("Important!");
            }
        }
    }
}
