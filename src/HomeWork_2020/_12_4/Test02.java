package HomeWork_2020._12_4;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2020 12 05
 * Time:11:09
 */
public class Test02 {
    public static void main(String[] args) {
        fun();
    }
    public static void fun(){
        int i = 1000;
        while (i!=2000){
            if(((i%4==0) && (i%100!=0))||(i%400==0)){
                System.out.println(i);
            }
            i++;
        }
    }
}
