package me.learning.day12;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Streams3 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 7, 6, 5, 4, 3, 2, 1, 2);
        Collection<Integer> collect = list.stream().filter(x -> x % 2 == 0).map(x -> x / 2).collect(Collectors.toList());
        System.out.println(collect);

        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 4322, 9, 0, 5, 44, 23, 433);

        List<Integer> filteredList = list2.stream()
                .filter(x -> x % 2 == 0)          // Step 1: Keep only even numbers
                .map(x -> x / 2)                  // Step 2: Divide by 2
                .distinct()                       // Step 3: Remove duplicates
                .sorted((a, b) -> b - a)          // Step 4: Sort in descending order
                .limit(2)                         // Step 5: Limit to top 2
                .collect(Collectors.toList());    // Step 6: Collect to list

        System.out.println(filteredList);

    }
}
