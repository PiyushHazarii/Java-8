package me.learning.day08;

import java.util.function.Consumer;

public class Consumerr {
    public static void main(String[] args) {
        Consumer<Integer> consumer = x -> System.out.println(x);
        consumer.accept(20);
    }
}

//import java.util.function.Supplier;
//
//public class Supplier1 {
//    public static void main(String[] args) {
//        Supplier<Integer> supplier = () -> 345;
//
//        System.out.println(supplier.get());
//    }
//}
