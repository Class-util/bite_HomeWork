package HomeWork_2020._12_4;

import java.util.Collections;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2020 12 05
 * Time:11:34
 */
public class Test06 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            while (sc.hasNext()) {
                int n = sc.nextInt();
                boolean flag = true;
                String str = String.join("", Collections.nCopies(n," "));
                for (int i = 0; i < n; i++) {
                    char[] temp = str.toCharArray();
                    temp[i] = '*';
                    temp[n-i-1] = '*';
                    System.out.println(new String(temp));
                }
            }
        }
    }
