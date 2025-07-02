package me.learning.day06;

import java.util.function.Predicate;

public class Predicate3 {
    public static void main(String[] args) {
        // these are the two predictes in which the third predicate can take both the
        // two predicates and then when both the conditions of the predicate is true
        // then only it will give true.
        Predicate<String> startsWithLetterV = x -> x.toLowerCase().charAt(0) == 'v';
        Predicate<String> endsWithLetterL = x -> x.toLowerCase().charAt(x.length() - 1) == 'l';

        Predicate<String> and = startsWithLetterV.and(endsWithLetterL);

        System.out.println(and.test("Vipul"));
    }
}

