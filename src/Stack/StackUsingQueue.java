package Stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    Queue<Integer> queue=new LinkedList<>();
    public void push(int x){
        queue.add(x);
        for (int i = 0; i < queue.size()-1; i++) {
            queue.add(queue.remove());
        }
    }
    public int pop(){
        return queue.remove();
    }
    public int peek(){
        return queue.peek();
    }
    public int size(){
        return queue.size();
    }
    public boolean isEmpty(){
        if (queue.size()==0){
            return true;
        }else{
            return false;
        }
    }
}
