package HomeWork_2021._2021_6;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2021 06 10
 * Time:21:30
 */
public class Test03 {
    //查找兄弟单词
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int wordsNum = scanner.nextInt();
            String[] dict = new String[wordsNum];
            for (int i = 0; i < wordsNum; i++) {
                dict[i] = scanner.next();
            }
            String target = scanner.next();
            int brotherIndex = scanner.nextInt();
            process(dict, target, brotherIndex);
            scanner.nextLine();
        }
    }

    public static void process(String[] dict, String target, int brotherIndex) {
        ArrayList<String> list = new ArrayList<>();
        Arrays.sort(dict);
        for (String cur : dict) {
            if (isBrother(target, cur)) {
                list.add(cur);
            }
        }
        System.out.println(list.size());
        if (brotherIndex <= list.size() && list.size() > 0) {
            System.out.println(list.get(brotherIndex - 1));
        }
    }

    public static boolean isBrother(String target, String cur) {
        // target can not same as cur
        if (target.equals(cur)) {
            return false;
        }
        // length must be same
        if (target.length() != cur.length()) {
            return false;
        }
        // norm case
        char[] targetArray = target.toCharArray();
        char[] curArray = cur.toCharArray();
        // sortted array must be same
        Arrays.sort(targetArray);
        Arrays.sort(curArray);
        for (int i = 0; i < curArray.length; i++) {
            if (targetArray[i] != curArray[i]) {
                return false;
            }
        }
        return true;
    }

    //乒乓球筐：将AB存入集合，只要B中某位置的元素在A中存在，那就删除B中的该位置的元素，最后B的长度不为0，说明存在B中的球的个数大于A，输出no，否则输出yes
    public static void main2(String[] args) {
        Scanner read = new Scanner(System.in);
        while(read.hasNextLine()) {
            String r = read.nextLine();
            String[] boxs = r.split(" ");
            ArrayList<Character> A = new ArrayList<Character>();
            ArrayList<Character> B = new ArrayList<Character>();
            for(int i = 0; i < boxs[0].length(); i++) {
                A.add(boxs[0].charAt(i));
            }
            for(int i = 0; i < boxs[1].length(); i++) {
                B.add(boxs[1].charAt(i));
            }
            for(int i = 0; i < B.size(); i++) {
                if(A.contains(B.get(i))) {
                    A.remove(A.get(A.indexOf(B.get(i))));
                    B.remove(i);
                    i--;
                }
            }
            if(B.size() == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
            A = null;
            B = null;
        }
    }


    //乒乓球筐，这样写循环太多会超时
    public static void main1(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){

            String str = sc.nextLine();
            String[] arr = str.split(" ");

            int count = 0;
            //记录A的个数
            for(int i = 0; i < arr[0].length(); i++){
                if("A".equals(arr[0].charAt(i) + "")){
                    count++;
                }
            }

            int flog = 0;
            //判端是否B的球都存在A中
            for(int i = 0; i < arr[1].length(); i++){
                if(!arr[0].contains(arr[1].charAt(i) + "")){
                    flog = 1;
                    break;
                }
            }

            HashMap<Character,Integer> mapA = new HashMap<>();
            HashMap<Character,Integer> mapB = new HashMap<>();

            //记录A中每个种类球的个数
            for (int i = 0; i < arr[0].length(); i++) {
                int num = 0;
                for (int j = 0; j < arr[0].length(); j++) {
                    if(arr[0].charAt(i) == arr[0].charAt(j)){
                        num++;
                    }
                }
                mapA.put(arr[0].charAt(i),num);
            }

            //记录B中每个球的个数
            for (int i = 0; i < arr[1].length(); i++) {
                int num = 0;
                for (int j = 0; j < arr[1].length(); j++) {
                    if(arr[1].charAt(i) == arr[1].charAt(j)){
                        num++;
                    }
                }
                mapB.put(arr[1].charAt(i),num);
            }

            if(flog == 1){
                System.out.println("No");
            }else {
                //判断是否每个B都小于A
                int sign = 0;
                for (int i = 0; i < arr[1].length(); i++) {
                    if(mapB.get(arr[1].charAt(i)) > mapA.get(arr[1].charAt(i))){
                        System.out.println("No");
                        sign = 1;
                        break;
                    }
                }
                if(sign == 0){
                    System.out.println("Yes");
                }
            }
        }
    }
}
