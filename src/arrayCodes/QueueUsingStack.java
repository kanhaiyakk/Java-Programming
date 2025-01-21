package arrayCodes;

import java.util.Stack;

public class QueueUsingStack {
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public QueueUsingStack() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int x) {
        // Push all elements from stack2 to stack1
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        // Push the new element to stack2
        stack2.push(x);
        // Move all elements back to stack2
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
    }

    public int peek() {
        if (stack2.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return stack2.peek();
    }

    public int pop() {
        if (stack2.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return stack2.pop();
    }

    public boolean empty() {
        return stack2.isEmpty();
    }

    // Main method to test the implementation
    public static void main(String[] args) {
        QueueUsingStack queue = new QueueUsingStack();

        queue.push(1);
        queue.push(2);
        queue.push(3);
        System.out.println(queue.peek()); // Output: 1
        System.out.println(queue.pop());  // Output: 1
        System.out.println(queue.peek()); // Output: 2
        System.out.println(queue.empty()); // Output: false

        queue.push(4);
        System.out.println(queue.pop());  // Output: 2
        System.out.println(queue.pop());  // Output: 3
        System.out.println(queue.pop());  // Output: 4
        System.out.println(queue.empty()); // Output: true
    }
}

