package zuoshen_code;

import java.util.Stack;

/**
 * @Auther lizequn
 * @Date 2020/12/30
 * @Desc 实现一个特殊栈，在实现栈的基本功能上，再实现返回栈中最小元素的操作。
 * 要求pop,push,popMin时间复杂度都为O（1），可使用现成的栈结构。 初级3 136分钟
 */
public class StackMin {
    private Stack<Integer> stackData = new Stack<>(); // 存储正常数据
    private Stack<Integer> stackMin = new Stack<>(); // 存储最小值

    private Integer min = Integer.MAX_VALUE;

    public void push(Integer i) {
        stackData.push(i);
        if (i < min)
            min = i;
        stackMin.push(min);
    }

    public Integer pop() {
        if (stackData.isEmpty())
            throw new ArrayIndexOutOfBoundsException("栈为空");
        stackMin.pop();
        return stackData.pop();
    }

    public Integer popMin() {
        if (stackMin.isEmpty())
            throw new ArrayIndexOutOfBoundsException("栈为空");
        return stackMin.peek();
    }
}
