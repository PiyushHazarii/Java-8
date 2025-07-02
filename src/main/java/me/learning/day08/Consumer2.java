package me.learning.day08;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumer2 {
    public static void main(String[] args) {
        // Consumer to print a string
        Consumer<String> consumer = s -> System.out.println(s);

        // Consumer to process and print a list of integers with 100 added to each
        Consumer<List<Integer>> listConsumer = li -> {
            for (Integer i : li) {
                System.out.println(i + 100);
            }
        };

        // Using the listConsumer on a list of integers
        listConsumer.accept(Arrays.asList(1, 2, 3, 4));
    }
}
