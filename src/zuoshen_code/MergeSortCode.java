package zuoshen_code;

import java.util.Arrays;

/**
 * @author: admin
 * @time: 2020/12/6 18:09
 * @description: 归并排序
 */
public class MergeSortCode {

    public static void main(String[] args) {
        int[] arr = {3, 6, 1, 5, 9, 7};
        mergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
//        int[] arr = {1, 3, 5, 2, 6, 7};
//        merge(arr,0, 2, 5);
//        System.out.println(Arrays.toString(arr));
    }

    // 归并，先归并两个子问题
    public static void mergeSort(int[] arr, int L, int R) {
        if (L == R)
            return;

        int mid = (L + R)/2;
        mergeSort(arr, L, mid);
        mergeSort(arr, mid+1, R);
        // 合并两个有序的子序列
        merge(arr, L, mid, R);
    }

    private static void merge(int[] arr, int L, int mid, int R) {
        int[] help = new int[R - L + 1];
        int p1 = L, p2 = mid+1;
        int len = 0;

        for(int i = 0; i < R - L + 1; i++){
            if (arr[p1] < arr[p2]) {
                help[i] = arr[p1++];
                len = i;
                if (p1 >= mid)
                    break;
            } else {
                help[i] = arr[p2++];
                len = i;
                if (p2 >= R)
                    break;
            }
        }


        while (p1 <= mid)
            help[++len] = arr[p1++];
        while (p2 <= R)
            help[++len] = arr[p2++];

        for(int i = 0; i < help.length; i++){
            arr[L + i] = help[i];
        }

    }
}
