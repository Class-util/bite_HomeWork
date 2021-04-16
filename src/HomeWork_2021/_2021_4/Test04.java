package HomeWork_2021._2021_4;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2021 04 16
 * Time:23:31
 */
public class Test04 {
    public static void main(String[] args) {
        int i = StrToInt1("456789");
        System.out.println(i);
    }

    //不要二
    public static void fun(){
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        int col = in.nextInt();

        int[][] grid = new int[row][col];
        //横向判断蛋糕位置
        for(int i=0; i<row; i++){
            if(i%4 == 0 || i%4 == 1){
                for(int j=0; j<col; j++){
                    if(j%4 == 0 || j%4 == 1){
                        grid[i][j] = 1;
                    }
                }
            }
            //纵向判断蛋糕位置
            else{
                for(int j=0; j<col; j++){
                    if(j%4 ==2 || j%4 == 3){
                        grid[i][j] = 1;
                    }
                }
            }
        }
        int sum = 0;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(grid[i][j] == 1){
                    sum++;
                }
            }
        }
        System.out.println(sum);
    }


 //字符串转成整数
    public static int StrToInt1(String str) {
        if(str.length() == 0)
            return 0;
        if(str.length() == 1 && (str.charAt(0) == '-' || str.charAt(0) == '+'))
            return 0;
        //判断正负
        boolean b = false;
        //不是其他字符串
        boolean flog = false;
        char[] chars = str.toCharArray();
        int i = 0;
        if(chars[i] == '-'){
            i++;
            b = true;
        }else {
            if(chars[i] == '+'){
                i++;
                b = false;
            }
        }
        int num  = 0;
        for (int j = i; j < chars.length; j++) {
            if (chars[j]>='0'&&chars[j]<='9'){
                num = num*10+(chars[j]-'0');
            }else {
                flog = true;
                break;
            }
        }
        if(!flog){
            if(b){
                num = -num;
            }
            return num;
        }else {
            return 0;
        }
    }

    //字符串转成整数，测试案例未通过
    public static int StrToInt(String str) {
        double num = 0;
        int j = 0;
        for (int i = str.length() - 1; i >= 0 ;i--) {
            char ch = str.charAt(i);
            if(ch >= 48 && ch <= 57){
                int tmp = Integer.parseInt(ch + "");
                num = num + tmp * Math.pow(10,j);
                j++;
            }else {
                return 0;
            }
        }
        return (int)num;
    }
}
