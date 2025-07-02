package me.learning.day10;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Unary_Binary {
    public static void main(String[] args) {
        // UnaryOperator to square a number
        // ye input jisme lega ussi mein return karega matlab agar Integer mein
        // imput liya hai to wo integer mein hi return karega
        UnaryOperator<Integer> square = x -> x * x;

        int number = 5;
        int result1 = square.apply(number);

        System.out.println("Square of " + number + " is: " + result1); // Output: 25


        // BinaryOperator to add two integers
        BinaryOperator<Integer> add = (a, b) -> a + b;

        int result2 = add.apply(10, 20);

        System.out.println("Sum is: " + result2);
    }
}
