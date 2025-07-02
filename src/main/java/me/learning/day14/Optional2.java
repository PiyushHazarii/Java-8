package me.learning.day14;

import java.util.Optional;

public class Optional2 {
    public static void main(String[] args) {
        Optional<String> name = getName(2);  // Simulate fetch by ID

        // If 'name' is present, use it. Otherwise, use "NA"
        String nameToBeUsed = name.orElse("NA");
        System.out.println(nameToBeUsed);

        String namee = name.orElseGet(() -> "Supplier lega ye");
        System.out.println(namee);

        String exceptions = name.orElseThrow(()-> new RuntimeException());
        System.out.println(exceptions);
    }

    private static Optional<String> getName(int id) {
//        return Optional.of("Shyam"); // it will give the name
        return Optional.empty();// the output will throw an exception
    }
}
