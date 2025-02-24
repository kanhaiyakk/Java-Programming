package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class CollectionsOnLL {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<String>();

        list.addFirst("is");
        list.addFirst("this");
        System.out.println(list);
        list.addLast("a");
        list.addLast("List");
        for (int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ->");
        }
        System.out.println("null");
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);

        list.remove(1);
        System.out.println(list);
    }
}
