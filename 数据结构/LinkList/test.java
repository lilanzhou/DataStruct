package 数据结构.LinkList;

/**
 * Created by Administrator on 2019:03:25
 *
 * @Author : Lilanzhou
 * 功能 :
 */
public class test {
    public static void main(String[] args) {
        LinkList linkList=new LinkList();
        linkList.insertFirst(32);
        linkList.insertFirst(22);
        linkList.insertFirst(43);
        linkList.insertFirst(21);
        linkList.display();
        linkList.delete(22);
        System.out.println();
        linkList.display();
    }
}
