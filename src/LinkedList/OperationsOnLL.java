package LinkedList;

public class OperationsOnLL {
    Node head;
    private int size;
    OperationsOnLL(){
        this.size=0;
    }
    class Node{

        String data;
        Node next;

        Node(String data1){
            this.data=data1;
            this.next=null;
            size++;
        }
    }
    //Add First in the LL
    public void addFirst(String data1){
        Node newNode=new Node(data1);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    //Add Last in LL
    public void addLast(String data1){
        Node newNode = new Node(data1);
        if (head==null){
           head= newNode;
            return;
        }
        Node cuurrNode=head;
        while (cuurrNode.next!=null){
            cuurrNode=cuurrNode.next;
        }
        cuurrNode.next=newNode;
    }
    public void printLL(){
        if (head==null){
            System.out.println("LL is empty");
            return;
        }
        Node currNode=head;
        while (currNode!=null){
            System.out.print(currNode.data+ "->");
            currNode=currNode.next;
        }
        System.out.println("null");

    }
    //delete first
    public void deleteFirst(){
        if (head==null){
            System.out.println("LL is empty");
            return;
        }
        size--;
        head=head.next;
    }

    //delete last
    public void deleteLast(){
        if (head==null){
            System.out.println("LL is empty");
            return;
        }
        size--;
        if (head.next==null){
            head=null;
            return;
        }

        Node secondLast=head;
        Node last=head.next;
        while (last.next!=null){
            last=last.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;

    }
    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
        OperationsOnLL obj=new OperationsOnLL();
        obj.addFirst("my");
        obj.addFirst("name");
        obj.printLL();
        obj.addFirst("Kanhaiya");
        obj.addLast("Kumar");
        obj.printLL();
        obj.deleteFirst();
        obj.printLL();
        obj.deleteLast();
        obj.printLL();
        System.out.println(obj.getSize());
        obj.addFirst("KK");
        System.out.println(obj.getSize());
    }
}
