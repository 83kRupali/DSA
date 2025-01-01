//package Apna_College.STL;

import java.util.List;
import java.util.ListIterator;
import java.util.*;

public class Iteratorr {
     public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 40);

        // Using Iterator for forward traversal
        Iterator<Integer> iterator = list.iterator();
        System.out.println("Using Iterator:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Using ListIterator for bidirectional traversal
        ListIterator<Integer> listIterator = list.listIterator();
        System.out.println("\nUsing ListIterator (Forward):");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println("\nUsing ListIterator (Backward):");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}
