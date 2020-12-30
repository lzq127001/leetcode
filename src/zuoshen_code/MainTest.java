package zuoshen_code;
/**
* @Auther lizequn
* @Date 2020/12/30
* @Desc 所有算法测试主方法
*/
public class MainTest {
    public static void main(String[] args) {
        Stack stack = new Stack(3);
        stack.push(1);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        stack.pop();
    }
}
