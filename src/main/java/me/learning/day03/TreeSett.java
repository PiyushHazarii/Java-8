package me.learning.day03;

import java.util.Set;
import java.util.TreeSet;

public class TreeSett {
    public static void main(String[] args) {

        // TreeSet with default natural sorting (ascending order)
        Set<Integer> s = new TreeSet<>();
        s.add(22);
        s.add(1);
        s.add(13);
        System.out.println("Before manual sorting (default ascending): " + s);

        // TreeSet with custom comparator for descending order
        // we can provide a comparator object in the constructor of tree set.
        Set<Integer> ss = new TreeSet<>((a, b) -> b - a);
        ss.add(22);
        ss.add(1);
        ss.add(13);
        System.out.println("After manual sorting (descending): " + ss);
    }
}

