package LinkedList;

public class BreakTheCycle {
    public static void breakCycle(ListNode1 head){
    ListNode1 meet=checkCycle(head);
    if (meet==null) return;
    ListNode1 start=head;
    while (start!=meet){
        start=start.next;
        meet=meet.next;
    }
    ListNode1 lastNode=start;
    while (lastNode.next!=start){
        lastNode=lastNode.next;
    }
    lastNode.next=null;
    System.out.println("Cycle Removed");
    }
    public static ListNode1 checkCycle(ListNode1 head) {
        ListNode1 fast = head;
        ListNode1 slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return slow;
            }
        }
        return null;
    }
    public static void printLL(ListNode1 head){
        ListNode1 temp=head;
        while (temp!=null){
            System.out.println(temp.data+" ->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ListNode1 head=new ListNode1(1);
        head.next=new ListNode1(2);
        head.next.next=new ListNode1(3);
        head.next.next.next=new ListNode1(4);
        head.next.next.next.next=new ListNode1(5);
        head.next.next.next.next.next=head.next.next;
        breakCycle(head);
        printLL(head);
    }
}
