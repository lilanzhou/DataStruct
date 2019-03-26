package 数据结构.StackAndQueue;

/**
 * Created by Administrator on 2019:03:24
 *
 * @Author : Lilanzhou
 * 功能 :
 */
public class Test {
    public static void main(String[] args) {

            MyStack stack=new MyStack(4);
            stack.push(21);
            stack.push(31);
            stack.push(41);
            stack.push(51);
            System.out.println(stack.isEmpty());
            System.out.println(stack.isFull());
            System.out.println(stack.peek());
            while (!stack.isEmpty()){
                System.out.println(stack.pop());
            }

    }
}
