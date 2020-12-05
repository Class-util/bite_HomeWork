package HomeWork_2020._12_4;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2020 12 05
 * Time:11:16
 */
public class Test03 {
    public static void main(String[] args) {
        int i = 1;
        while (i!=101){
            if(isPrime(i))
                System.out.println(i);
            i++;
        }
    }

    public static boolean isPrime(int num) {
        int max = (int)Math.sqrt(num);
        for (int i = 2; i <= max; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
