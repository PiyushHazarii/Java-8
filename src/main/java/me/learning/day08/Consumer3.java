package me.learning.day08;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumer3 {
    public static void main(String[] args) {
        // First Consumer: adds 100 and prints each element
        Consumer<List<Integer>> listConsumer1 = li -> {
            for (Integer i : li) {
                System.out.println(i + 100);
            }
        };

        // Second Consumer: prints each element as-is
        Consumer<List<Integer>> listConsumer2 = li -> {
            for (Integer i : li) {
                System.out.println(i);
            }
        };

        // Chain the consumers using andThen
        Consumer<List<Integer>> listConsumer = listConsumer2.andThen(listConsumer1);

        // Accept a list of integers
        listConsumer.accept(Arrays.asList(1, 2, 3, 4));
    }
}
