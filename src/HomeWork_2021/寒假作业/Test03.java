package HomeWork_2021.寒假作业;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2021 01 26
 * Time:16:24
 */
public class Test03 {
    public static void main(String[] args) {
        int value = getValue(2);
        System.out.println(value);
        isPalindrome(55);
    }
    public static boolean isPalindrome(int x) {
        //分析所有情况
        //负数不是回文数
        //个位数为0的不是回文数（0除外）
        if(x%10==0&&x!=0||x<0){
            return false;
        }
        int flog = 0;
        while (x>flog){
            flog = flog *10 + x%10;
            x/=10;
        }
        return x==flog||x==flog/10;
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        /*if(magazine.length() < ransomNote.length())
            return false;
        int[] arr = new int[26];
        for(char ch : ransomNote.toCharArray()){
            int index = magazine.indexOf(ch,arr[ch - 'a']);
            if(index == -1)
                return false;
            arr[ch - 97] = index  + 1;
        }
        return true;*/
        char[] ch1 = ransomNote.toCharArray();
        char[] ch2 = magazine.toCharArray();
        if(ch2.length < ch1.length)
            return false;
        int[] ran = new int[26];
        int[] mag = new int[26];
        for (char c : ch1) {
            ran[c - 'a']++;
        }
        for (char c : ch2) {
            mag[c - 'a']++;
        }
        for (int i = 0; i < ran.length; i++) {
            if(ran[i] > mag[i])
                return false;
        }
        return true;
    }

    public static int getValue(int i) {
        int result = 0;
        switch (i) {
            case 1:
                result = result + i;
            case 2:
                result = result + i * 2;
            case 3:
                result = result + i * 3;
        }
        return result;
    }
}
