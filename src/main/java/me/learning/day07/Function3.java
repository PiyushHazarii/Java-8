package me.learning.day07;

import java.util.function.Function;

public class Function3 {
    public static void main(String[] args) {
        // Function to convert string to uppercase
        Function<String, String> function1 = s -> s.toUpperCase();

        // Function to get the first 3 characters of the string
        Function<String, String> function2 = s -> s.substring(0, 3);

        // Chaining function1 and function2 using andThen
        Function<String, String> stringStringFunction = function1.andThen(function2);
        // OR Aise bhi kr skte hai
        System.out.println(function1.andThen(function2).apply("Viplav"));

        // Applying the combined function to input
        System.out.println(stringStringFunction.apply("Vipul")); // Output: VIP
    }
}
