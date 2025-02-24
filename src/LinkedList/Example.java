package LinkedList;


import org.w3c.dom.Node;

public class Example {
     class Node{
        int data;
        Node next;

        Node(int data1,Node next1){
            this.data=data1;
            this.next=next1;
        }
        Node(int data1){
            this.data=data1;
            this.next=null;
        }
    }

    private static Node convertArr2LL(int[] arr){
        Example ex=new Example();
         Node head=ex.new Node(arr[0]);
         Node mover=head;
        for (int i = 1; i <arr.length ; i++) {

            Node temp=ex.new Node(arr[i]);
            mover.next=temp;
            mover=temp;
        }
        return head;
    }
    public static void main(String[] args) {
       // Example ex=new Example();
        int[] arr = {12, 4, 8, 6};
        Node head=convertArr2LL(arr);
        //Node y = ex.new Node(arr[2]);
        System.out.println(head.data);
    }
}

