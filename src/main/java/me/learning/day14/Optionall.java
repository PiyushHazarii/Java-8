package me.learning.day14;

import java.util.Optional;

public class Optionall {
    public static void main(String[] args) {
        Optional<String> name = getName();

        if (name.isPresent()) {
            System.out.println(name); // agar .get nhi lagate hai to Optional[Ram] dega output
            System.out.println(name.get()); // then ye actual name dega i.e Ram.
        } else {
            System.out.println("No name found.");
        }

        // yaha pr ye x mein ram hi le raha hai lekin use nhi kr raha hai
        name.ifPresent(x-> System.out.println("Yes Name is not null" ));

    }

    private static Optional<String> getName() {
        String name = "Ram";
        return Optional.of(name); // Always returns a non-empty Optional
    }
}
