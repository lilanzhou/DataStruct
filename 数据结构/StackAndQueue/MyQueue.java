package 数据结构.StackAndQueue;

/**
 * Created by Administrator on 2019:03:24
 *
 * @Author : Lilanzhou
 * 功能 :
 */
public class MyQueue {
    private long [] arr;
    private int elements;
    private int front;
    private int end;
    public MyQueue(){
        arr=new long[0];
        elements=0;
        front=0;
        end=-1;
    }
    public MyQueue(int length){
        arr=new long[length];
        elements=0;
        front=0;
        end=-1;
    }
    public void insert(int numbers){
        elements++;//有效元素
        arr[++end]=numbers;
    }
    public long remove(){
        elements--;
        return arr[front++];
    }
    public long peek(){
        return arr[front];
    }
    public boolean isEmpty(){
        return elements==0;
    }
    public boolean isFull(){
        return elements==arr.length;
    }
}
