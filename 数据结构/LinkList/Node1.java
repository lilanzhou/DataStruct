package 数据结构.LinkList;

/**
 * Created by Administrator on 2019:03:25
 *
 * @Author : Lilanzhou
 * 功能 : 节点 相当于车厢
 */
public class Node1 {
    //数据域
    public int data;
    //指针域
    public Node1 next;

    public Node1() {
    }

    public Node1(int value) {
        this.data = value;
    }
    /**
     * 显示方法
     */
    public void display(){
        System.out.print(data+" ");
    }
}
