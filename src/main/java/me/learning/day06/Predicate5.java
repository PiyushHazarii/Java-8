package me.learning.day06;

import java.util.function.Predicate;

public class Predicate5 {
    public static void main(String[] args) {
        // ye upar wala predicate mein jo string diye and
        // niche wale sout mein jo string diye hai usko match karta hai
        // agar kuch bhi match krna hai to ye is Equal use hota hai
        Predicate<Object> predicate = Predicate.isEqual("Vipul");
        System.out.println(predicate.test("Vipul")); // Output: true
    }
}

