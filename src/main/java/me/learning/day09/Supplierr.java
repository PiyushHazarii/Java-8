package me.learning.day09;

import java.util.function.Supplier;

public class Supplierr {
    public static void main(String[] args) {
        Supplier<Integer> sup = () -> 12;
        System.out.println(sup.get());
    }
}
