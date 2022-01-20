package org.example.interview;

import java.util.ArrayList;
import java.util.List;

public class Index {

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();

        linkedList.addLast(new Node(1));

        linkedList.addLast(new Node(2));

        System.out.println("size: " + linkedList.size());

        linkedList.printNodes();

        System.out.println(linkedList.removeFirst());
        System.out.println(linkedList.removeLast());

        System.out.println(linkedList.removeLast());

        System.out.println("size: " + linkedList.size());

        System.out.println("Printing at the end: ");

        linkedList.printNodes();

        List<Integer> list = new ArrayList<>(5);

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.parallelStream().forEach(System.out::println);
    }
}
