package HomeWork_2020._12_4;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2020 12 05
 * Time:12:23
 */
public class Test13 {
    public static void main(String[] args) {
        String username = "wubo";
        String password = "123456";

        Scanner sc = new Scanner(System.in);

        int i = 3;
        while (i!=0){
            --i;
            System.out.println("用户名"+username);
            System.out.println("请输入密码：");
            String str = sc.nextLine();
            boolean equals = str.equals(password);
            if(!equals){
                System.out.println("登陆失败，还剩"+i+"次");
            }else {
                System.out.println("登录成功");
                break;
            }
        }
    }
}
