package me.learning.day12;

import java.util.Arrays;

public class Streamss {
    public static void main(String[] args) {
        // Imperative approach
        int[] array = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sum += array[i];
            }
        }
        System.out.println("Sum using for-loop: " + sum);

        // Stream (functional) approach
        int[] array2 = {1, 2, 3, 4, 5};

        // when we want to use filter method, map method like this then we use streams
        int sum2 = Arrays.stream(array2).filter(n -> n % 2 == 0).sum();
        System.out.println("Sum using stream: " + sum2);
    }
}
