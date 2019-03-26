package 数据结构.StackAndQueue;

/**
 * Created by Administrator on 2019:03:24
 *
 * @Author : Lilanzhou
 * 功能 :
 */
public class TestQueue {
    public static void main(String[] args) {
        MyQueue myQueue=new MyQueue(5);
        myQueue.insert(21);
        myQueue.insert(32);
        myQueue.insert(43);
        myQueue.insert(33);
        myQueue.insert(33);
        System.out.println(myQueue.isEmpty());
        System.out.println(myQueue.isFull());
        while (!myQueue.isEmpty()){
            System.out.println(myQueue.remove());
        }
    }

}
