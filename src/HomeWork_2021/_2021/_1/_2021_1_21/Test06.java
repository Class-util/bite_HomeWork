package HomeWork_2021._2021._1._2021_1_21;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2021 01 24
 * Time:19:29
 */
public class Test06 {
    public static void main(String[] args) {
        String s = "ab#c";
        String t = "ad#c";
        boolean b = backspaceCompare(s, t);
        System.out.println(b);
    }
    public static boolean backspaceCompare(String S, String T) {
        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            if(S.charAt(i) == '#'){
                if(!s1.isEmpty()){
                    s1.pop();
                }
                continue;
            }
            s1.push(S.charAt(i));
        }
        for (int i = 0; i < T.length(); i++) {
            if(T.charAt(i) == '#'){
                if(!s2.isEmpty()){
                    s2.pop();
                }
                continue;
            }
            s2.push(T.charAt(i));
        }
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        while (!s1.isEmpty()){
            str1.append(s1.pop());
        }
        while (!s2.isEmpty()){
            str2.append(s2.pop());
        }
        return str1.toString().equals(str2.toString());
    }
}
