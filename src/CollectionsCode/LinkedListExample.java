package CollectionsCode;

import java.util.TreeSet;

public class LinkedListExample {

        public static void main(String[] args) {
//        LinkedList<String> list = new LinkedList<String>();
//        list.add("C");
//        list.add("C++");
//        list.add("Python");
//        list.add("Java");
//        list.add("PHP");
//        System.out.println("Original list is: "+ list);
//        list.addFirst("scala");
//        list.addFirst("HTML");
//        System.out.println("After adding element by using addFirst() method: " + list);
//        list.removeFirst();
//        System.out.println("After adding element by using removeFirst() method: " + list);
//        System.out.println("After adding element by using getFirst() method: " + list.getFirst());
//        list.addLast("CSS");
//        System.out.println("After adding element by using addLast() method: " + list);
//        list.removeLast();
//        System.out.println("After adding element by using removeLast() method: " + list);
//        System.out.println("After adding element by using getLast() method: " + list.getLast());
//            Vector<String> lis = new Vector<String>();
//            System.out.println("In vector addElement() method is also used to add elements ");
//            lis.add("Tiger");
//            lis.add("Lion");
//            lis.add("Dog");
//            lis.add("Elephant");
//            lis.addElement("Rat");
//            lis.addElement("Cat");
//            lis.addElement("Deer");
//            System.out.println(lis);

            TreeSet <String> animal=new TreeSet<String>();
            animal.add("Dog");
            animal.add("Tiger");
            animal.add("Lion");
            animal.add("Fox");
            animal.add("Rabbit");
            System.out.println(animal);
            System.out.println(animal.descendingSet());
            System.out.println(animal.pollFirst());
            System.out.println(animal.pollLast());
            System.out.println(animal.headSet("Lion"));
            System.out.println(animal.tailSet("Fox"));
    }

    }
