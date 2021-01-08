package HomeWork_2021._2021_1_8;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2021 01 08
 * Time:15:45
 */
class ListNode{
    private int val;
    private ListNode prev;
    private ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ListNode getPrev() {
        return prev;
    }

    public void setPrev(ListNode prev) {
        this.prev = prev;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
public class DoubleLinkedList {
    private ListNode head = new ListNode(-1);
    private ListNode last;

    //头插法
    public void addFirst(int data){
        ListNode node = new ListNode(data);
        if(head.getNext() == null){
            head.setNext(node);
            last = node;
            return ;
        }
        node.setNext(head.getNext());
        head.getNext().setPrev(node);
        head.setNext(node);
    }
    //尾插法
    public void addLast(int data){
        ListNode node = new ListNode(data);
        if(head.getNext() == null){
            head.setNext(node);
            last = node;
            return ;
        }
        node.setPrev(last);
        node.setNext(null);
        last.setNext(node);
        last = node;
    }
    //打印双向链表
    public void display(){
        ListNode cur = head.getNext();
        while(cur != null){
            System.out.print(cur.getVal() + " ");
            cur = cur.getNext();
        }
        System.out.println("");
    }
    //计算双向链表长度
    public int size(){
        ListNode cur = head.getNext();
        int count = 0;
        while(cur != null){
            count++;
            cur = cur.getNext();
        }
        return count;
    }
    //判断关键字key是否存在
    public boolean contains(int key){
        ListNode cur = head.getNext();
        while (cur != null){
            if(cur.getVal() == key)
                return true;
            cur = cur.getNext();
        }
        return false;
    }
    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data){
        if(index < 0 || index > size())
            return ;
        ListNode node = new ListNode(data);
        if(index == 0){
            addFirst(data);
            return ;
        }
        if(index == size()){
            addLast(data);
            return ;
        }
        int count = 0;
        ListNode cur = head.getNext();
        while(count != index){
            cur = cur.getNext();
            count++;
        }
        ListNode prev = cur.getPrev();
        node.setNext(cur);
        node.setPrev(prev);
        cur.setPrev(node);
        prev.setNext(node);
    }
    //删除第一次出现关键字key的结点
    public void remove(int key){
        if(head.getNext().getVal() == key){
            head.setNext(head.getNext().getNext());
            head.getNext().setPrev(null);
            return ;
        }
        ListNode cur = head.getNext();
        while (cur != null){
            if(cur.getVal() == key){
                if(cur == last){
                    cur.getPrev().setNext(null);
                    last = cur.getPrev();
                    return ;
                }
                ListNode prev = cur.getPrev();
                ListNode curNext = cur.getNext();
                curNext.setPrev(prev);
                prev.setNext(curNext);
                break;
            }
            cur = cur.getNext();
        }
    }
    //删除所有值为key的节点
    public void removeAllKey(int key) {
        ListNode cur = head.getNext();
        while (cur != null){
            if(cur.getVal() == key){
                if(cur == head.getNext()){
                    if(head.getNext().getNext() != null){
                        head.getNext().setPrev(null);
                    }
                    head.setNext(head.getNext().getNext());
                } else {
                    cur.getPrev().setNext(cur.getNext());
                    if(cur.getNext() != null){
                        cur.getNext().setPrev(cur.getPrev());
                    }else {
                        last = last.getPrev();
                    }
                }
            }
            cur = cur.getNext();
        }
    }
    public void clear() {
        this.head = this.last = null;
    }
}
