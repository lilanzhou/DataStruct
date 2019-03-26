package 数据结构.doubleSideLinkList;

/**
 * Created by Administrator on 2019:03:25
 *
 * @Author : Lilanzhou
 * 功能 :
 */
public class Node {
    //数值域
    public int data;
    public Node next;
    public Node previous;
    public Node(int value){
        this.data=value;
    }
    public void display(){
        System.out.print(data+" ");
    }
}
