package Lowes_Prep;

//Search an element in a Linked List (Iterative and Recursive)
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class SearchElementInLL {
    public static boolean searchInLL(Node head, int target){
//        Node curr=head;
//        while (curr!=null){
//            if (curr.data==target){    //Search an element in a Linked List (Iterative Approach)
//                                       // - O(N) Time and O(1) Space
//                return true;
//            }
//            curr=curr.next;
//        }
//        return false;

        //Recursive Approach
        Node curr=head;

        if (head==null) return false;
        if (curr.data==target){
            return true;
        }
        return searchInLL(curr.next,target);

    }

    public static void main(String[] args) {
        Node head=new Node(0);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(5);
        head.next.next.next.next=new Node(7);

        int target=4;
        System.out.println(searchInLL(head,target));
    }
}
