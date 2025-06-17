package LinkedList;

public class Add1ToNumLL {
    public static ListNode add1ToNumLL(ListNode head){
        int carry=helperFun(head);
        if (carry==1){
            ListNode newNode=new ListNode(1);
            newNode.next=head;
            head= newNode;
        }
        return head;
    }
    public static int helperFun(ListNode temp){
        if (temp==null){
            return 1;
        }
        int carry=helperFun(temp.next);
        temp.val +=carry;
        if (temp.val<10) return 0;
        temp.val=0;
        return 1;
    }
    public static void printLL(ListNode head){
        ListNode temp=head;
        while (temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ListNode head=new ListNode(9);
        head.next=new ListNode(9);
        head.next.next=new ListNode(9);
        System.out.println("Before adding 1 to LL");
        printLL(head);

        head=add1ToNumLL(head);
        System.out.println("After add 1 to ll");
        printLL(head);


    }
}
