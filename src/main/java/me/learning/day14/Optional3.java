package me.learning.day14;

import java.util.Optional;

public class Optional3 {
    public static void main(String[] args) {
        Optional<String> optional = getName(2);

        // Using map to convert the value to uppercase if present
        Optional<String> optional1 = optional.map(x -> x.toUpperCase());

        // Print the result
        optional1.ifPresent(System.out::println); // Output: RAM
    }

    private static Optional<String> getName(int id) {
        return Optional.of("ram");
    }
}
