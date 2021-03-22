package HomeWork_2021._2021._1._2021_1_19;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2021 01 19
 * Time:16:54
 */
public class Test01 {
    String str = new String("good");
    char[ ] ch = { 'a' , 'b' , 'c' };
    public static void main1(String[] args){
        Test01 ex = new Test01();
        ex.change(ex.str,ex.ch);
        System.out.print(ex.str + " and ");
        System.out.print(ex.ch);
    }
    public void change(String str, char[] ch){
        str = "test ok";
        ch[0] = 'g';
    }
}
class SystemUtil{
    public static boolean isAdmin(String userId){
        return userId.toLowerCase()=="admin";
    }
    public static void main(String[] args){
        System.out.println(isAdmin("Admin"));
        String s1="abc"+"def";//1
        String s2=new String(s1);//2
        if(s1.equals(s2))//3
            System.out.println(".equals succeeded");//4
        if(s1==s2)//5
            System.out.println("==succeeded");//6
    }
}
