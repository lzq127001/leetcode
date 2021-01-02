package zuoshen_code;

import java.util.Arrays;

/**
 * @author: lizequn
 * @time: 2021/1/1 16:54
 * @description: 经典快排
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 9, 8, 5, 6, 7, 9};
        int[] result = partition(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(result));
    }



    public static int[] partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        while (low < high) {
            while (low < high && arr[high] >= pivot)
                high--;
            arr[low] = arr[high];
            while (low < high && arr[low] <= pivot)
                low++;
            arr[high] = arr[low];
        }
        arr[low] = pivot;
        return arr;
    }

}
