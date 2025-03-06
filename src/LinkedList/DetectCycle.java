package LinkedList;
class ListNode1{
    int data;
    ListNode1 next;
    ListNode1(int data){
        this.data=data;
        this.next=null;
    }
}
public class DetectCycle {
    public static boolean detectCycle(ListNode1 head){
        ListNode1 slow=head;
        ListNode1 fast=head;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if (slow==fast){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode1 head=new ListNode1(1);
        head.next=new ListNode1(2);
        head.next.next=new ListNode1(3);
        head.next.next.next=new ListNode1(4);
        head.next.next.next.next=new ListNode1(5);
        head.next.next.next.next.next=head.next.next;
        System.out.println(detectCycle(head));
    }
}
