package 数据结构.BinaryTree;

/**
 * Created by Administrator on 2019:03:27
 *
 * @Author : Lilanzhou
 * 功能 :
 */
public class test {
    public static void main(String[] args) {
        BinaryTree tree=new BinaryTree();
        tree.insert(2,"A");
        tree.insert(1,"B");
        tree.insert(2,"C");
        tree.insert(3,"D");

        tree.firstOrder(tree.root); //先序遍历是按插入顺序输出的
        tree.interOrder(tree.root);//中序遍历则是有序输出的
        tree.lastOrder(tree.root);
        tree.find(3);
        tree.find(4);
    }
}
