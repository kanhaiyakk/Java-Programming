package LinkedList;
class Node1 {
    int data;
    Node2 next;

    Node1(int data1, Node2 next1){
        this.data=data1;
        this.next=next1;
    }
    Node1(int data1){
        this.data=data1;
        this.next=null;
    }
}
public class TraversalLL {
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

    public static void main(String[] args) {
        int[] arr={5,6,8,10,18,12};
        Node2 head=traverseLL(arr);
        Node2 temp=head;
        while (temp!=null){

            System.out.print(temp.data+ " ");
            temp=temp.next;
        }
    }
}
