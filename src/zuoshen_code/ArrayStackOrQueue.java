package zuoshen_code;

import com.sun.org.apache.bcel.internal.generic.RET;

/**
 * @author: lizequn
 * @time: 2020/12/29 22:23
 * @description: 用固定的数组结构实现一个栈或队列
 */

public class ArrayStackOrQueue {
    public static void main(String[] args) {
    }
}

/**
 * 栈
 */
class Stack {
    private Integer[] arr; // 数组
    private Integer index; // 栈的当前指针

    // 构造函数
    public Stack(Integer initSize) {
        if (initSize < 0) {
            throw new IllegalArgumentException("初始化长度不能小于0");
        }
        arr = new Integer[initSize];
        index = 0;
    }

    public void push(Integer i) {
        if (index == arr.length) {
            throw new ArrayIndexOutOfBoundsException("已超出栈长度");
        }
        arr[index++] = i;
    }

    public Integer peek() {
        if (index == 0) {
            return null;
        }
        return arr[index - 1];
    }

    public Integer pop() {
        if (index == 0) {
            throw new ArrayIndexOutOfBoundsException("栈为空");
        }
        return arr[--index];
    }
}

/**
 * 队列
 */
class Queue {
    private Integer[] arr;
    private Integer start;
    private Integer end;
    private Integer size;

    public Queue(Integer initSize) {
        arr = new Integer[initSize];
        start = 0;
        end = 0;
        size = 0;
    }

    public void push(Integer i) {
        if (size == arr.length)
            throw new ArrayIndexOutOfBoundsException("队列已满");
        arr[end] = i;
        end = end == arr.length - 1 ? 0 : end++;
        size++;
    }

    public Integer peek() {
        if (size == 0)
            return null;
        return arr[start];
    }

    public Integer pop() {
        if (size == 0)
            throw new ArrayIndexOutOfBoundsException("队列为空");
        int tmp = arr[start];
        start = start == arr.length - 1 ? 0 : start++;
        size--;
        return tmp;
    }
}
