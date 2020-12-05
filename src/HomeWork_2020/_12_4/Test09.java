package HomeWork_2020._12_4;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2020 12 05
 * Time:12:02
 */
public class Test09 {
    public static void main(String[] args) {
            double sum1=0;
            for(double i=1;i<=99;i+=2){
                sum1+=(1/i);
            }
            double sum2=0;
            for(double j=2;j<=100;j+=2){
                sum2+=(1/j);
            }
            System.out.println(sum1-sum2);
        }
    }
