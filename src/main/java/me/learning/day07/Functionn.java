package me.learning.day07;

import java.util.function.Function;

// Importing the Function interface from java.util.function package
import java.util.function.Function;

// it is an functional interface
public class Functionn {

    // Main method where the program execution starts
    public static void main(String[] args) {

        // Creating a Function that takes a String and returns its length as Integer
        // x -> x.length() is a lambda expression (anonymous function)
        // It receives 'x' (a String) and returns x.length() (an Integer)
        Function<String, Integer> function = x -> x.length();

        // Creating another Function that takes a String and returns a substring from index 0 to 4
        // s -> s.substring(0, 4) is also a lambda expression
        Function<String, String> function2 = s -> s.substring(0, 4);

        // Input string on which the functions will operate
        String input = "FunctionDemo";

        // Applying the first function: calculates the length of 'input'
        System.out.println("Length of string: " + function.apply(input));

        // Applying the second function: extracts substring from index 0 to 4
        System.out.println("Substring (0 to 4): " + function2.apply(input));
    }
}

