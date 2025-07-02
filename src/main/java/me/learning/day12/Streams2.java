package me.learning.day12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streams2 {
    public static void main(String[] args) {
        // Creating a stream from a List
        List<String> list = Arrays.asList("apple", "banana", "cherry");
        Stream<String> myStream = list.stream();

        myStream.forEach(System.out::println);

        // Creating a stream from an Array
        String[] array = {"apple", "banana", "cherry"};
        Stream<String> stream = Arrays.stream(array);

        stream.forEach(System.out::println);

        Stream<Integer> integerStream = Stream.of(1, 2, 3);
        System.out.println("\nStream.of():");
        integerStream.forEach(System.out::println);

        // 4. Stream.iterate() - Infinite stream (limited)
        // iterate ek starting point lega and ek lambda expression lega jo ki
        // UnaryOperator hai matlab wo same cheez lega and same cheez dega
        Stream<Integer> limit = Stream.iterate(0, n -> n + 1).limit(10);
        System.out.println("\nStream.iterate():");
        limit.forEach(System.out::println);

        // 5. Stream.generate() - Random numbers (limited)
        Stream<Integer> limit1 = Stream.generate(() -> (int)(Math.random() * 100)).limit(10);
        System.out.println("\nStream.generate():");
        limit1.forEach(System.out::println);

    }
}
