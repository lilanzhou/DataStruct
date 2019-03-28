package 数据结构.BinaryTree;

/**
 * Created by Administrator on 2019:03:27
 *
 * @Author : Lilanzhou
 * 功能 :
 */
public class BinaryTree {
    public Node root;//根节点

    /**
     * 插入节点
     * */
    public void insert(int value,String sValue){
        Node newNode=new Node(value,sValue);//封装节点信息
        //引用当前节点
        Node current=root;
       //引用父节点
        Node parent;
        if(root==null){
            root=newNode;
        }else{

            while(true) {
                parent = current;
                if (current.data > value) {
                    current = current.leftChild;//往下比较
                    if (current == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    current = current.rightChild;
                    if (current == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }
    /**
     * 遍历二叉树
     */
    public void firstOrder(Node localNode){
        if(localNode!=null){
            System.out.println(localNode.data+"--"+localNode.sData);
            firstOrder(localNode.leftChild);
            firstOrder(localNode.rightChild);
        }
    }

    /**
     * 中序遍历
     * @param localNode
     */
    public void interOrder(Node localNode){
        if(localNode!=null){
            interOrder(localNode.leftChild);
            System.out.println(localNode.data+"--"+localNode.sData);
            interOrder(localNode.rightChild);
        }
    }

    /**
     * 后序遍历
     * @param localNode
     */
    public void lastOrder(Node localNode){
        if(localNode!=null){
            interOrder(localNode.rightChild);
            interOrder(localNode.leftChild);
            System.out.println(localNode.data+"--"+localNode.sData);

        }
    }
    /**
     * 查找一个数
     */
    public void find(int value){
        Node current=root;
        while (value!=current.data) {
            if (current.data > value) {
                current = current.leftChild;
            } else {
                current = current.rightChild;
            }
            if (current == null) {
                System.out.println("Not find you need number");
            }
        }
         System.out.println(current.sData);
    }

}
