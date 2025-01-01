//package Apna_College.STL;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.*;

public class Functorss {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        // Predicate: Checks if a number is even
        Predicate<Integer> isEven = num -> num % 2 == 0;

        // Function: Squares a number
        Function<Integer, Integer> square = num -> num * num;

        // Consumer: Prints a number
        Consumer<Integer> print = num -> System.out.println("Value: " + num);

        // Applying Functors
        System.out.println("Even Numbers:");
        list.stream().filter(isEven).forEach(System.out::println); // Filter even numbers

        System.out.println("\nSquares:");
        list.stream().map(square).forEach(print); // Apply square function and print
    }
}
