package 数据结构.SimpleSort;

import org.junit.Test;

/**
 * Created by Administrator on 2019:03:24
 *
 * @Author : Lilanzhou
 * 功能 :
 */
public class selectSort {
    public static void selectSort(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            int k=i;
            for (int j = i; j <arr.length ; j++) {
                if(arr[j]<arr[k]){
                    k=j;//使得下标为k的值为最小
                }
            }
            int temp=arr[k];
            arr[k]=arr[i];
            arr[i]=temp;
        }
    }
    @Test
    public void test(){
        int arr[]={21,12,32,23,12,45};
        selectSort(arr);
        for (int number:arr
             ) {
            System.out.print(number+"--");
        }
    }
}
