package Stack;

public class MyStack {
    int[] arr=new int[5];
    int top=-1;

    public void push(int num){
        top++;
        arr[top]=num;
    }
    public int pop(){
        int x=arr[top];
        top--;
        return x;
    }
    public int peek(){
        return arr[top];
    }
    public int size(){
        return top+1;

    }

}
