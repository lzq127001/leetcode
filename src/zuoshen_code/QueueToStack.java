package zuoshen_code;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Auther lizequn
 * @Date 2020/12/30
 * @Desc 用队列实现栈结构 初级3 138分钟
 */
public class QueueToStack {
    private Queue<Integer> data = new LinkedList<>(); // 存放队列
    private Queue<Integer> help = new LinkedList<>(); // 辅助队列

    public void push(Integer i) {
        data.add(i);
    }

    public Integer pop() {
        if (data.isEmpty())
            throw new ArrayIndexOutOfBoundsException("栈为空");
        while (data.size() > 1) {
            help.add(data.poll());
        }
        int tmp = data.peek();
        swap();
        return tmp;
    }

    public Integer peek() {
        if (data.isEmpty())
            throw new ArrayIndexOutOfBoundsException("栈为空");
        while (data.size() != 1) {
            help.add(data.poll());
        }
        int tmp = data.poll();
        help.add(tmp);
        swap();
        return tmp;
    }

    private void swap() {
        Queue<Integer> temp = help;
        help = data;
        data = temp;
    }
}
