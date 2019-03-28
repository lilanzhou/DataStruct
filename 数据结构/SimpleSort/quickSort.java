package 数据结构.SimpleSort;

import java.util.Arrays;

/**
 * Created by Administrator on 2019:03:27
 *
 * @Author : Lilanzhou
 * 功能 :
 */
public class quickSort {
    public static void main(String[] args) {
   int arr[]={32,443,65,445,12,344,22,4};
    quick(arr,0,arr.length-1);
    System.out.println(Arrays.toString(arr));
    }
    public static void quick(int arr[],int first,int last){
       int start=first;
       int end=last;
       int key=arr[first];//设置关键字
        while(start<end){

            while(start<end&&arr[end]>=key)
                end--;

            if(arr[end]<=key){
                int temp=arr[end];
                arr[end]=arr[start];
                arr[start]=temp;
            }
            while(end>start&&arr[start]<=key)
                start++;
            if(arr[start]>=key){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
            }
        }
        if(first<start)quick(arr,first,start-1);
        if(end<last) quick(arr,end+1,last);
    }
}
