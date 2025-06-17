package LinkedList;

public class ReverseLL {
    public static ListNode reverseLL(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        while (curr!=null){
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
    public static void printLL(ListNode head){
        ListNode current=head;
        while (current!=null){
            System.out.print(current.val+"->");
            current=current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);
        System.out.println("Original Linked List");
        printLL(head);

        head=reverseLL(head);
        System.out.println("Reversed Linked list");
        printLL(head);
    }
}
