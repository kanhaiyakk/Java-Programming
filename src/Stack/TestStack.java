package Stack;

public class TestStack {
    public static void main(String[] args) {
       // MyStack stack=new MyStack();
        StackUsingQueue stack=new StackUsingQueue();
        stack.push(5);
        stack.push(10);
        stack.push(25);
        System.out.println(stack.peek());
        stack.push(15);
        System.out.println(stack.pop());
        System.out.println(stack.size());
    }
}
