package zuoshen_code;

/**
 * @author: lizequn
 * @time: 2021/1/1 10:18
 * @description: 转圈打印矩阵 初级4-1 16
 * 从整体宏观上看，顺时针转圈打印就是从外圈一圈一圈往里打印出来，如何打印最外层一圈？再往里一圈？
 */
public class RoundPrint {

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16},
                {17, 18, 19, 20}
        };
//        printAround(arr, 0, 0, arr.length - 1, arr[0].length - 1);
        printRotate(arr);
    }

    // 转圈打印矩阵
    public static void printRotate(int[][] arr) {
        int ar = 0, ac = 0;
        int br = arr.length - 1;
        int bc = arr[0].length - 1;
        int maxTimes = Math.max((br - ar), (bc - ac));
        for (int i = 0; i < maxTimes; i++) {
            if (ar == br || ac == bc)
                printAround(arr, ar + i, ac + i, br - i, bc - i);
            if (ar + i == br || ac + i == bc)
                return;
            printAround(arr, ar + i, ac + i, br - i, bc - i);
        }
    }

    // 打印一圈 A点代表左上角的点，B点代表右下角的点。A(ar, ac); B(br, bc)
    public static void printAround(int[][] arr, int ar, int ac, int br, int bc) {
        if (ar == br) { // 当矩阵只有一行时
            for (int i = 0; i < arr[0].length; i++)
                System.out.print(arr[ar][ac + i] + " ");
        } else if (ac == bc) { // 当矩阵只有一列时
            for (int i = 0; i < arr.length; i++)
                System.out.print(arr[ar + i][ac] + " ");
        } else {
            int curR, curC;
            curR = ar;
            curC = ac;
            while (curC < bc) {
                System.out.print(arr[curR][curC++] + " ");
            }
            while (curR < br) {
                System.out.print(arr[curR++][curC] + " ");
            }
            while (curC > ac) {
                System.out.print(arr[curR][curC--] + " ");
            }
            while (curR > ar) {
                System.out.print(arr[curR--][curC] + " ");
            }
        }
    }
}
