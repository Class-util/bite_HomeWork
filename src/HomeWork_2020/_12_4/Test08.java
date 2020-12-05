package HomeWork_2020._12_4;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2020 12 05
 * Time:11:53
 */
public class Test08 {
    public static void main(String[] args) {
        int i = 0;
        while (i!=999){
            i++;
            if(i < 100)
                continue;
            //百位数
            int a = i / 100;
            //十位数
            int b = (i/10) % 10;
            //个位数
            int c = i % (a * 10 + b);
            if (Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3)== i)

                System.out.println(i+"是水仙花数");
        }
    }
}
