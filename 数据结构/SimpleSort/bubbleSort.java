package 数据结构.SimpleSort;

import org.junit.Test;

import java.lang.reflect.Array;

/**
 * Created by Administrator on 2019:03:24
 *
 * @Author : Lilanzhou
 * 功能 :
 */
public class bubbleSort {
    public static void bubbling(int arr[]){
        int temp=-1;
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = i; j <arr.length ; j++) {
                if(arr[i]>arr[j]){
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
    }
    @Test
    public void test(){
        int arr[]={23,21,45,22,1,22};
        bubbling(arr);
        for (int a:arr
             ) {
        System.out.print(a+"---");
        }
    }
}
