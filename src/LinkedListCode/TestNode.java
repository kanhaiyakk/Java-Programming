package LinkedListCode;


import java.sql.Struct;

class Node{
    int data;
    Node next;
    Node(){};
    Node(int data1,Node next1){
        this.data=data1;
        this.next=next1;
    }
    Node(int data1){
        this.data=data1;
        this.next=null;
    }
}
public class TestNode {
    public static void main(String[] args) {
        int[] arr={2,6,8,9};
        Node y=new Node(arr[2]);
        System.out.println(y.data);
    }

}
