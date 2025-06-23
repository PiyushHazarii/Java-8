package me.learning.day03;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapp {
    public static void main(String[] args) {

        // TreeMap with default natural ordering (ascending by keys)
        Map<Integer, String> m = new TreeMap<>();
        m.put(2, "z");
        m.put(3, "f");
        m.put(1, "y");
        System.out.println("Before manual sorting: " + m);

        // TreeMap with custom comparator for descending order by keys.
        // we can provide a comparator object in the constructor of tree set.
        Map<Integer, String> mm = new TreeMap<>((a, b) -> b - a);
        mm.put(2, "z");
        mm.put(3, "f");
        mm.put(1, "y");
        System.out.println("After manual sorting desc: " + mm);
    }
}
