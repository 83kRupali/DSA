//package Apna_College.STL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Algorithmm {
     public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(5, 1, 3, 2, 4));

        // Sorting
        Collections.sort(list);
        System.out.println("Sorted List: " + list); // [1, 2, 3, 4, 5]

        // Reversing
        Collections.reverse(list);
        System.out.println("Reversed List: " + list); // [5, 4, 3, 2, 1]

        // Shuffling
        Collections.shuffle(list);
        System.out.println("Shuffled List: " + list);

        // Binary Search
        Collections.sort(list); // Binary search requires sorted order
        int index = Collections.binarySearch(list, 3);
        System.out.println("Index of 3: " + index); // Index position of 3
    }
}
