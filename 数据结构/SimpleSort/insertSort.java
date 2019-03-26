package 数据结构.SimpleSort;

import org.junit.Test;

/**
 * Created by Administrator on 2019:03:24
 *
 * @Author : Lilanzhou
 * 功能 :
 */
public class insertSort {
    public static void insertSort(int arr[]) {
        int temp = 0;
        for (int i = 1; i < arr.length; i++) {
            temp = arr[i];//保存每次要插入的值
            int j = i;
            while (j > 0 && arr[j-1] >temp) {
                arr[j] = arr[j - 1];//把大于需要插入的值往后挪
                j--;
            }
            arr[j] = temp;
        }
    }

    @Test
    public void test() {
        int arr[] = {21,12, 32, 23, 12, 45};
        insertSort(arr);
        for (int var : arr
                ) {
            System.out.print(var + "-");
        }

    }
}
