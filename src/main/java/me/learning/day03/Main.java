package me.learning.day03;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(6);
        list.add(0);
        list.add(99);
        list.add(6);

        // this is the normal form to do this sorting into decending order just to
        // use comparator class.
//        Collections.sort(list,new Sortingg());
        // Sorting in descending order using lambda expression
        Collections.sort(list, (a, b) -> b - a);

        System.out.println(list); // Output: [99, 6, 6, 2, 0]
    }
}

