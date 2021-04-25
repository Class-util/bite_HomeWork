package HomeWork_2021._2021_4;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2021 04 25
 * Time:22:39
 */

abstract class Animal{
    abstract void say();
}

public class Test13 extends Animal {

        //跳石板
    //广度优先遍历
        public static void main(String[] args){
            Scanner input=new Scanner(System.in);
            while(input.hasNext()){
                int N=input.nextInt();
                int M=input.nextInt();
                HashMap<Integer, Integer> list=new HashMap<>();
                LinkedList<Integer> queue=new LinkedList<>();
                list.put(N, 0);   //当前所在位置，0步
                queue.add(N);
                while(!queue.isEmpty()){
                    int num=queue.remove();
                    if(num==M){        //满足条件时，输出
                        System.out.println(list.get(num));
                        return ;
                    }
                    if(num>M)     //石板超过目标时不考虑
                        continue;
                    HashSet<Integer> arr=new HashSet<>();   //存储当前石板的所有约数
                    yueShu(num, arr);                //找约数
                    for(int elem: arr){
                        if(!list.containsKey(num+elem)){     //记录下一次起跳时的石板
                            list.put(num+elem, list.get(num)+1);
                            queue.add(num+elem);
                        }
                    }
                }
                System.out.println(-1);
            }
        }
        public static void yueShu(int num, HashSet<Integer> arr){    //约数计算
            for(int i=2; i<=Math.sqrt(num); i++){
                if(num%i==0){
                    arr.add(i);
                    arr.add(num/i);
                }
            }
        }



    //参数解析
        public static void main2(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            char[] charArray = str.toCharArray();
            List<String> list = new ArrayList<String>();
            //未遇到引号，标志位设为false
            boolean isleftyinhao = false;
            String temp = "";
            for(int i = 0; i < charArray.length; i++){
                //如果遇到引号，且此时左引号标志位为false，那么判断此引号为左引号
                if(charArray[i] == '\"' && !isleftyinhao){
                    isleftyinhao = true;
                    continue;
                }
                //如果遇到引号，且此时左引号标志位为true，那么判断此引号为右引号
                if(charArray[i] == '\"' && isleftyinhao){
                    isleftyinhao = false;
                    continue;
                }
                //遇到引号间空格的情况
                if(charArray[i] == ' ' && isleftyinhao){
                    temp += charArray[i];
                    continue;
                }
                //遇到正常空格的情况
                if(charArray[i] == ' '){
                    list.add(temp);
                    temp ="";
                    continue;
                }
                //其他情况
                temp += charArray[i];
            }
            //将最后一个加上
            list.add(temp);

            //输出
            System.out.println(list.size());
            for(int i = 0; i < list.size(); i++){
                System.out.println(list.get(i));
            }

        }



    public Test13(){
        System.out.println("i am cat");
    }

    public static void main1(String[] args) throws InterruptedException {
        /*int x = 20;
        int y = 30;
        boolean b = x>50&&y>60||x>50&&y<-60||x<-50&&y>60||x<-50&&y<-60;
        System.out.println(b);*/
        /*int i = 0;
        for (out('A');out('B')&&(i<2);out('C')){
            i++;
            out('D');
        }*/
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                dehfhj();
            }
        });
        thread.start();
        thread.join();
        System.out.println("123");
    }

    private static void dehfhj() {
        System.out.println("asd");
    }

    public static boolean out(char c){
        System.out.println(c);
        return true;
    }


    @Override
    void say() {

    }
}
