package 数据结构.SimpleSort;

/**
 * Created by Administrator on 2019:03:26
 *
 * @Author : Lilanzhou
 * 功能 :
 */
public class shellSort {
    public static void main(String[] args) {
    int arr[]={21,443,22,1,54,33,65};
    shell(arr);
        for (int var:arr
             ) {
            System.out.print(var);
        }
    }
    public static void shell(int arr[]){
        int h=1;
        while (h<arr.length/3){
            h=3*h+1;//计算最大间隔
        }
        while(h>0){

            int temp=0;
            for (int i = h; i <arr.length ; i++) {
                temp=arr[i];//保存要插入的数
                int j=i;
                while (j>h-1&&arr[j-h]>=temp){
                    arr[j]=arr[j-h];
                    j-=h;
                }
                arr[j]=temp;
            }
            h=(h-1)/3;
        }
    }
}
