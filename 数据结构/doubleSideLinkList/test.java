package 数据结构.doubleSideLinkList;

/**
 * Created by Administrator on 2019:03:25
 *
 * @Author : Lilanzhou
 * 功能 :
 */
public class test {
    public static void main(String[] args) {
        DoubleLinkList list=new DoubleLinkList();
        list.insertFirst(23);
        list.insertFirst(32);
        list.insertFirst(21);
        list.insertLast(23);
        list.insertLast(32);
        list.insertLast(21);
        list.display();
    }
}
