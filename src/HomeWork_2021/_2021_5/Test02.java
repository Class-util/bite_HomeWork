package HomeWork_2021._2021_5;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2021 05 07
 * Time:20:37
 */
public class Test02 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String wildcard = scanner.next();
            String target = scanner.next();
            System.out.println(matchStr(wildcard, target));
        }
    }
    //字符串通配符
    public static boolean matchStr(String wildcard, String target) {
        int targetIndex = 0;
        boolean startFound = false;
        for (int i = 0; i < wildcard.length(); i++) {
            if (startFound) {
                if ((target.charAt(targetIndex) >= '0' && target.charAt(targetIndex) <= '9') || (target.charAt(targetIndex) >= 'a' && target.charAt(targetIndex) <= 'z') || (target.charAt(targetIndex) >= 'A' && target.charAt(targetIndex) <= 'Z')) {
                } else {
                    if (wildcard.charAt(i) != target.charAt(targetIndex)) {
                        return false;
                    }
                    startFound = false;
                }
            }
            if (wildcard.charAt(i) == '?') {
            } else if (wildcard.charAt(i) == '*') {
                startFound = true;
            } else {
                if (wildcard.charAt(i) != target.charAt(targetIndex)) {
                    return false;
                }
            }
            targetIndex += 1;
        }
        return true;
    }
    //统计每个月兔子的总数
    public static int getTotalCount(int mounthCount){
        if(mounthCount == 1 || mounthCount == 2){
            return 1;
        }
        //有生育能力的兔子
        int num = 1;
        //当月生的小兔子个数
        int young = 1;
        //一个月大
        int mounth1 = 1;
        //两个月大
        int mounth2 = 0;
        for(int i = 4;i <= mounthCount; i++){
            //第二个月大变有生育
            num += mounth2;
            //一个月大变两个月大
            mounth2 = mounth1;
            //有生育生出一个月大
            mounth1 = num;
            //当月小兔子个数
            young = mounth1 + mounth2;
        }
        return num + young;
    }
}
