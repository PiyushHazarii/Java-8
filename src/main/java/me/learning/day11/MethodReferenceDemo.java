package me.learning.day11;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void sayHello() {
        System.out.println("Hello, I am " + name);
    }

    static void staticGreet(String name) {
        System.out.println("Hello from static method, " + name);
    }

    String getName() {
        return this.name;
    }
}

public class MethodReferenceDemo {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // 1. Reference to a static method
        names.forEach(Person::staticGreet);

        System.out.println();

        // 2. Reference to an instance method of a particular object
        Person printer = new Person("Printer");
//        names.forEach(printer::sayHello); // Not valid directly, so let's use another list
        List<Person> people = Arrays.asList(new Person("Aman"), new Person("Bina"), new Person("Chirag"));
        people.forEach(Person::sayHello); // 3. Reference to an instance method of any object of a particular type

        System.out.println();

        // 4. Reference to a constructor
        Supplier<Person> personSupplier = () -> new Person("Default");
        Supplier<Person> personSupplierRef = () -> new Person("ConstructorRef");

        Person p1 = personSupplier.get();
        Person p2 = personSupplierRef.get();
        System.out.println("Created person: " + p1.getName());
        System.out.println("Created person: " + p2.getName());
    }
}
