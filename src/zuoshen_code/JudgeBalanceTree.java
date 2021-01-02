package zuoshen_code;

/**
 * @author: lizequn
 * @time: 2021/1/2 19:13
 * @description: 判断一颗树是否为平衡树
 * 四个变量需要注意，左树是否平衡，左树的高度，右树是否平衡，右树的高度。
 * 因为要用递归的办法来判断，因此写一个办法返回树的 平衡，和 高度。
 */
public class JudgeBalanceTree {

    // 办法返回的实体类
    public static class ReturnData {
        public boolean isB;
        public int h;

        public ReturnData(boolean isB, int h) {
            this.isB = isB;
            this.h = h;
        }
    }

    // 主要办法，返回一棵树的平衡性 和 高度
    public static ReturnData process(Node head) {
        if (head == null) {
            return new ReturnData(true, 0);
        }
        ReturnData leftData = process(head.left);
        if (!leftData.isB) {
            return new ReturnData(false, 0);
        }
        ReturnData rightData = process(head.right);
        if (!rightData.isB) {
            return new ReturnData(false, 0);
        }
        if (Math.abs(leftData.h - rightData.h) > 1) {
            return new ReturnData(false, 0);
        }
        return new ReturnData(true, Math.max(leftData.h, rightData.h) + 1);
    }
}
