package 数据结构.StackAndQueue;

import org.junit.Test;

/**
 * Created by Administrator on 2019:03:24
 *
 * @Author : Lilanzhou
 * 功能 :
 */
public class MyStack {
    private long arr[] ;
    private int top;
    public MyStack(){
        arr=new long[0];
        top=-1;
    }
    public MyStack(int length){
        arr=new long[length];
        top=-1;
    }
    public void push(int elements){
        arr[++top]=elements;
    }
    public long peek(){
        return arr[top];
    }
    public long pop(){
        return arr[top--];
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public boolean isFull(){
        return top==arr.length-1;
    }


}
