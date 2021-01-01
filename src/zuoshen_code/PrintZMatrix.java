package zuoshen_code;

/**
 * @author: lizequn
 * @time: 2021/1/1 11:52
 * @description: 打印之字型矩阵 初级4-2 3
 * 两个点，从左上角出发，一个往右走，一个往下走。对角线，输出。
 */
public class PrintZMatrix {

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16},
                {17, 18, 19, 20}
        };
//        printDiagonal(false, arr, 3, 0, 0, 3);
        printZ(arr);
    }

    public static void printZ(int[][] arr) {
        Boolean fromUp = false;
        int ar = 0, ac = 0, br = 0, bc = 0;
        int endR = arr.length - 1;
        int endC = arr[0].length - 1;
        while (ac != endC + 1) {
            printDiagonal(fromUp, arr, ar, ac, br, bc);
            // 下面这四个的顺序要注意，因为有些值的先后改变会导致跳过节点
            ac = ar == endR ? ++ac : ac;
            ar = ar == endR ? endR : ++ar;
            br = bc == endC ? ++br : br;
            bc = bc == endC ? endC : ++bc;
            fromUp = !fromUp;
        }
    }

    // 打印对角线
    public static void printDiagonal(Boolean fromUp, int[][] arr, int ar, int ac, int br, int bc) {
        if (ar == br && ac == bc) {
            System.out.print(arr[ar][ac] + " ");
            return;
        }
        if (fromUp == true) {
            while (br <= ar) {
                System.out.print(arr[br++][bc--] + " ");
            }
        } else {
            while (ar >= br) {
                System.out.print(arr[ar--][ac++] + " ");
            }
        }
    }
}
