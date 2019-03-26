package 数据结构.doubleSideLinkList;

/**
 * Created by Administrator on 2019:03:25
 *
 * @Author : Lilanzhou
 * 功能 :
 */
public class DoubleLinkList {
    private Node first;
    private Node last;
    public DoubleLinkList(){
        this.first=null;
        this.last=null;
    }
    /**
     * 插入数据
     */
    public void insertFirst(int value){
        Node newNode=new Node(value);
        if (first==null){
            last=newNode;
        }else {
            first.previous=newNode;
            //把first节点往下移动
            newNode.next=first;
        }
        first=newNode;
    }
    public void insertLast(int value){
        Node newNode=new Node(value);
        if(first==null){
            first=newNode;
        }else {
            last.next=newNode;
            newNode.previous=last;
        }
        last=newNode;

    }

    /**
     * 显示数据
     */
    public void display(){
        if(first==null){
            return;
        }
        Node current=first;
        while (current!=null){
            current.display();
            current=current.next;
        }
    }
}
