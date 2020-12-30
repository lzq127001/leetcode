package zuoshen_code;
/**
* @Auther lizequn
* @Date 2020/12/30
* @Desc 所有算法测试主方法
*/
public class MainTest {
    public static void main(String[] args) {
        StackToQueue queue = new StackToQueue();
        queue.push(3);
        queue.push(6);
        queue.push(10);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}
