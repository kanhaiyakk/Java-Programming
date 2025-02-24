package LinkedList;

class Node2 {
    int data;
    Node2 next;

    Node2(int data1, Node2 next1){
        this.data=data1;
        this.next=next1;
    }
    Node2(int data1){
        this.data=data1;
        this.next=null;
    }
}
public class LengthOfLL {
    private static Node2 traverseLL(int[] arr){
        Node2 head=new Node2(arr[0]);
        Node2 mover=head;
        for (int i = 1; i < arr.length ; i++) {
            Node2 temp=new Node2(arr[i]);
            mover.next=temp;
            mover=temp;
        }
        return head;
    }
    private static int lengthOfLL(Node2 head){
        int count=0;
        Node2 temp=head;
        while (temp!=null){
            temp=temp.next;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr={4,3,9,7,6};
        Node2 head=traverseLL(arr);
        System.out.println(lengthOfLL(head));
    }
}
