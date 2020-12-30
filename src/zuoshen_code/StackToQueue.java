package zuoshen_code;

import java.util.Stack;

/**
 * @Auther lizequn
 * @Date 2020/12/30
 * @Desc 用栈实现队列结构 初级3 138分钟
 */
public class StackToQueue {
    private Stack<Integer> pushStack = new Stack<>();
    private Stack<Integer> popStack = new Stack<>();

    public void push(Integer i) {
        pushStack.add(i);
        pushToPop();
    }

    public Integer poll() {
        pushToPop();
        if (popStack.isEmpty())
            throw new ArrayIndexOutOfBoundsException("队列为空");
        return popStack.pop();
    }

    public Integer peek() {
        pushToPop();
        if (popStack.isEmpty())
            throw new ArrayIndexOutOfBoundsException("队列为空");
        return popStack.peek();
    }

    // 将push栈中的数导出到pop栈中，这样从pop栈弹出就相当于队列了。
    public void pushToPop() {
        if (popStack.isEmpty() && !pushStack.isEmpty()) {
            while (!pushStack.isEmpty())
                popStack.push(pushStack.pop());
        }
    }
}
