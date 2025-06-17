package arrayCodes;
class ListNode{
    int data;
    ListNode next;
    ListNode(int data){
        this.data=data;
        this.next=null;
    }
}
public class mergeTwoLL {
    public static ListNode mergeTwoLists(ListNode head1, ListNode head2){
        ListNode dummy= new ListNode(0);
        ListNode curr=dummy;
        while (head1!=null && head2!=null){
            if (head1.data <= head2.data){
                curr.next=head1;
                head1=head1.next;
            }else{
                curr.next=head2;
                head2=head2.next;
            }
            curr=curr.next;
        }
        if (head1!=null) curr.next=head1;
        if (head2!=null) curr.next=head2;
        return dummy.next;
    }
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
    public static ListNode createList(int[] arr){
        if (arr.length==0) return null;
        ListNode head=new ListNode(arr[0]);
        ListNode temp=head;
        for (int i = 1; i < arr.length; i++) {
            temp.next=new ListNode(arr[i]);
            temp=temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] list1 = {1, 3, 5, 7};
        int[] list2 = {2, 4, 6, 8, 10};

        ListNode l1 = createList(list1);
        ListNode l2 = createList(list2);

        System.out.println("List 1:");
        printList(l1);

        System.out.println("List 2:");
        printList(l2);

        ListNode merged = mergeTwoLists(l1, l2);

        System.out.println("Merged List:");
        printList(merged);
    }
}
