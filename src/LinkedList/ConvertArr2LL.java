package LinkedList;

class Node{
        int data;
        Node2 next;

        Node(int data1, Node2 next1){
            this.data=data1;
            this.next=next1;
        }
        Node(int data1){
            this.data=data1;
            this.next=null;
        }
}
public class ConvertArr2LL {
    private static Node2 convertArr2LL(int[] arr){
//        Example ex=new Example();
        Node2 head=new Node2(arr[0]);
        Node2 mover=head;
        for (int i = 1; i <arr.length ; i++) {

            Node2 temp=new Node2(arr[i]);
            mover.next=temp;
            mover=temp;
        }
        return head;
    }
    public static void main(String[] args) {
        int[] arr = {12, 4, 8, 6};
        Node2 head=convertArr2LL(arr);
        System.out.println(head.data);
    }
}

