package me.learning.day06;

import java.util.function.Predicate;

public class Predicatee {
    public static void main(String[] args) {
        // it is a functional interface so we can use lambda expression as its implementation.
        // iske andar ek test method hai jo T type matlab generic type ka value leta hai
        // and return karega wo boolean mein kyuki ye boolean type ka function hai
        Predicate<Integer> salaryGreaterThan1Lac = x -> x > 100000;

        System.out.println(salaryGreaterThan1Lac.test(1000));

    }
}
