package 数据结构.LinkList;

/**
 * Created by Administrator on 2019:03:25
 *
 * @Author : Lilanzhou
 * 功能 :
 */
public class LinkList {
    //头结点
    private Node1 first;
    public LinkList(){
        first=null;
    }
    /**
     * 插入值，在头结点插入
     */
    public void insertFirst(int value){
        Node1 node=new Node1(value);
        if(first==null) {
            first = node;
        }else {
            node.next= first;
            first=node;
        }
    }
   public Node1 deleteFirst(){
        Node1 temp=first;
        first=temp.next;
        return temp;
   }
    /**
     * 显示链表
     */
    public void display(){
        Node1 current=first;
        while (current!=null){
            current.display();
            System.out.print(current.next!=null?"-->":"");
            current=current.next;
        }
    }
    /**
     * 删除指定的数字
     */
    public void delete(int delNumber){
        Node1 current=first;//从第一个节点开始查找
        Node1 previous=first;//记录先前一个节点
        while (current.data!=delNumber){
            if(current.next==null){
                System.out.print("链表中没有要删除的数字！");
            }
            previous=current;
            current=current.next;
        }
        if(current==first){
            first=current.next;//删除的是第一个节点 也就是删除第一个数
        }else {
            previous.next=current.next;//当前current节点的上个节点指向当前节点的下一个节点
        }

    }
}
