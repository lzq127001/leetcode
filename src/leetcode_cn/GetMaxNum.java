package leetcode_cn;

/*
 * @Author: lizequn
 * @Date: 2020/12/6 14:00
 * @Desc 递归获取最大数
 *      递归 先分成若干子问题，获取子问题的解。
 */
public class GetMaxNum {

    //将数组分成两部分，分别最大值。
    public static int getMax(int[] arr, int L, int R) {
        if (L == R)
            return arr[L];

        int mid = (L + R)/2;
        int maxLeft = getMax(arr, L, mid);
        int maxRight = getMax(arr, mid+1, R);
        return Math.max(maxLeft, maxRight);
    }

    public static void main(String[] args) {
        int[] arr = {3, 6, 8, 2, 9, 10, 1};
        System.out.println(getMax(arr, 0, arr.length - 1));
    }

}
