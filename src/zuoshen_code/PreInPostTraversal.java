package zuoshen_code;

import java.util.Stack;

/**
 * @author: lizequn
 * @time: 2021/1/2 15:23
 * @description: 二叉树的遍历 初级5 30
 */
public class PreInPostTraversal {

    // 先序遍历 递归版本
    public static void preOrderRecur(Node head) {
        if (head == null) {
            return;
        }
        System.out.println(head.value);
        preOrderRecur(head.left);
        preOrderRecur(head.right);
    }

    // 中序遍历
    public static void inOrderRecur(Node head) {
        if (head == null) {
            return;
        }
        inOrderRecur(head.left);
        System.out.println(head.value);
        inOrderRecur(head.right);
    }

    // 后序遍历
    public static void postOrderRecur(Node head) {
        if (head == null) {
            return;
        }
        postOrderRecur(head.left);
        postOrderRecur(head.right);
        System.out.println(head.value);
    }

    // 先序遍历 非递归版本（递归：计算机帮我们弹栈压栈。非递归：我们自己弹栈压栈。）
    public static void preOrderUnRecur(Node head) {
        System.out.println("pre-order:");
        if (head != null) {
            Stack<Node> stack = new Stack<>();
            stack.push(head);
            while (!stack.isEmpty()) {
                head = stack.pop();
                System.out.println(head.value);
                if (head.right != null)
                    stack.push(head.right);
                if (head.left != null)
                    stack.push(head.left);
            }
        }
        System.out.println();
    }

    // 中序遍历
    public static void inOrderUnRecur(Node head) {
        System.out.println("in-order: ");
        if (head != null) {
            Stack<Node> stack = new Stack<>();

            while (!stack.isEmpty() || head != null) {
                if (head != null) {
                    stack.push(head);
                    head = head.left;
                } else {
                    head = stack.pop();
                    System.out.println(head.value);
                    head = head.right;
                }
            }
        }
        System.out.println();
    }

    // 后序遍历
    /**
     * 解析：后序：左右中。 那就先实现中右左，把这些中右左放到一个栈里，弹出则是左右中。（因此需要两个栈）
     * 怎么实现中右左呢？实现先序遍历时已经实现了 中左右，改下即可。
     * 代码留到之后思考写。
     * @param head
     */
    public static void postOrderUnRecur(Node head) {
        System.out.println("post-order: ");
        if (head != null) {

        }
    }
}
