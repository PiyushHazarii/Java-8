package me.learning.day03;

import java.util.Comparator;

// thsi is a comparator class
public class Sortingg implements Comparator<Integer>{

    // if i gave you in a - b then it will sort in ascending order
    // if i gave you b - a then it will sort it in decending order.
    @Override
    public int compare(Integer a, Integer b) {
        return b - a;
    }
}
