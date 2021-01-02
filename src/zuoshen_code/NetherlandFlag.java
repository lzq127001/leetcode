package zuoshen_code;

import java.util.Arrays;

/**
 * @author: lizequn
 * @time: 2021/1/1 15:49
 * @description: 荷兰国旗问题 给定数组，数num，小于num的放数组左边，等于放中间，大于的放右边
 * 要求额外空间复杂度O(1), 时间复杂度O(N)
 */
public class NetherlandFlag {

    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 9, 8, 5, 6, 7, 9};
        int[] result = partition(arr, 0, arr.length - 1, 5);
        System.out.println(Arrays.toString(result));
    }
    public static int[] partition(int[] arr, int L, int R, int num) {
        int less = L - 1;
        int more = R + 1;
        int cur = L; // 当前指针
        while (cur < more) {
            if (arr[cur] < num)
                swap(arr, ++less, cur++);
            else if (arr[cur] > num)
                swap(arr, --more, cur);
            else
                cur++;
        }
        return arr;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
