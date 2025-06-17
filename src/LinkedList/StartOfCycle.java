package LinkedList;

public class StartOfCycle {
    public static ListNode startingPoint(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if (slow==fast){
                slow=head;
                while (slow!=fast){
                    slow=slow.next;
                    fast=fast.next;
                }
                return slow;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);
        head.next.next.next.next.next=new ListNode(6);
        head.next.next.next.next.next.next=head.next.next;

        ListNode start=startingPoint(head);
        if (start!=null){
            System.out.println("Starting Point of Loop is: " + start.val);
        }else{
            System.out.println("There is no loop in this LL");
        }
    }
}
