package FlipkartDsaPrep;

class Node3 {
    int val;
    Node3 next;

    Node3(int val) {
        this.val = val;
        this.next = null;
    }
}
public class MiddleOfLL {
    public static int  middleOfLL(Node3 head){
        if (head==null) return -1;
        Node3 slow=head;
        Node3 fast=head;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.val;
    }

    public static void main(String[] args) {
        // Example 1: Odd length linked list
        Node3 head1 = new Node3(1);
        head1.next = new Node3(2);
        head1.next.next = new Node3(3);
        head1.next.next.next = new Node3(4);
        head1.next.next.next.next = new Node3(5);

        int middle1 = middleOfLL(head1);
        System.out.println("Middle of [1->2->3->4->5]: " + middle1);
         //Output: 3

         //Example 2: Even length linked list
        Node3 head2 = new Node3(1);
        head2.next = new Node3(2);
        head2.next.next = new Node3(3);
        head2.next.next.next = new Node3(4);
        head2.next.next.next.next = new Node3(5);
        head2.next.next.next.next.next = new Node3(6);

        int middle2 = middleOfLL(head2);
        System.out.println("Middle of [1->2->3->4->5->6]: " + middle2);
        // Output: 4
    }
}
