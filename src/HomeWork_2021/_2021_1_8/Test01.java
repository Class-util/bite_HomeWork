package HomeWork_2021._2021_1_8;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2021 01 08
 * Time:16:26
 */
public class Test01 {
    public static void main(String[] args) {
        DoubleLinkedList l = new DoubleLinkedList();
        l.addLast(1);
        l.addLast(1);
        l.addFirst(1);
        l.addFirst(4);
        l.display();
//        l.remove(4);
//        l.display();
        l.removeAllKey(4);
        l.display();
    }
}
