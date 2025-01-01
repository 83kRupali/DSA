//package Apna_College.STL;
import java.util.ArrayList;
import java.util.List;

//DoublyLinked List

public class Lists {
  
        public static void main(String[] args) {
            // Create a List using ArrayList
            List<String> list = new ArrayList<>();
    
            // Add elements
            list.add("Apple");
            list.add("Banana");
            list.add("Cherry");
            list.add("Apple"); // Duplicates are allowed
    
            // Display the list
            System.out.println("List: " + list);
    
            // Access elements
            System.out.println("Element at index 1: " + list.get(1)); // Access by index
    
            // Remove elements
            list.remove("Apple"); // Removes the first occurrence of "Apple"
            System.out.println("After removal: " + list);
    
            // Iterate through the list
            System.out.println("Iterating through the list:");
            for (String fruit : list) {
                System.out.println(fruit);
            }

            List<Integer>ll = new ArrayList<>();
            ll.add(10);
            ll.add(20);
            ll.add(30);

            System.out.println(ll);
           
        }
    }
