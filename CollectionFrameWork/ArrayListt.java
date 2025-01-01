//package Apna_College.STL;

import java.util.ArrayList;

public class ArrayListt {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> list = new ArrayList<>();

        // Add elements
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("Initial List: " + list); // Output: [10, 20, 30]

        // Add an element at a specific index
        list.add(1, 15);
        System.out.println("After adding 15 at index 1: " + list); // Output: [10, 15, 20, 30]

        // Get an element
        int value = list.get(2);
        System.out.println("Element at index 2: " + value); // Output: 20

        // Update an element
        list.set(2, 25);
        System.out.println("After updating index 2 to 25: " + list); // Output: [10, 15, 25, 30]

        // Remove an element
        list.remove(1);
        System.out.println("After removing element at index 1: " + list); // Output: [10, 25, 30]

        // Check if a value exists
        boolean contains = list.contains(25);
        System.out.println("List contains 25: " + contains); // Output: true

        // Clear the list
        list.clear();
        System.out.println("After clearing the list: " + list); // Output: []
    }
}
