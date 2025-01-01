//package Apna_College.STL;

import java.util.*;

public class Container {
    public static void main(String[] args) {
        // List Operations
        List<Integer> list = new ArrayList<>();
        list.add(10);         // Add element
        list.add(20);
        list.add(30);
        list.add(1, 15);      // Add at index
        System.out.println("List: " + list); // [10, 15, 20, 30]

        // Set Operations
        Set<Integer> set = new HashSet<>();
        set.add(10);          // Add element
        set.add(20);
        set.add(10);          // Duplicate ignored
        System.out.println("Set: " + set); // [10, 20]

        // Queue Operations
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(10);      // Enqueue
        queue.offer(20);
        System.out.println("Queue Peek: " + queue.peek()); // Peek at head (10)
        System.out.println("Queue Poll: " + queue.poll()); // Dequeue (10)
        System.out.println("Queue: " + queue); // [20]

        // Map Operations
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);     // Add key-value pair
        map.put("B", 20);
        System.out.println("Map: " + map); // {A=10, B=20}
        System.out.println("Value of 'A': " + map.get("A")); // Retrieve value for key 'A'
        map.remove("A");      // Remove key-value pair
        System.out.println("Map after removal: " + map); // {B=20}
    }
}
