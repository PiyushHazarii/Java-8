package me.learning.day06;

import java.util.function.Predicate;

public class Predicate4 {
    public static void main(String[] args) {
        Student s1 = new Student("Vipul", 1);
        Student s2 = new Student("Ram", 2);

        // this will also take objects
        // here x is student and x.getId gives you the id of that student
        Predicate<Student> studentPredicate = x -> x.getId() > 1;

        // ye false dega kyuki s1 object mein id 1 hai to wo greater than nahi hai.
        System.out.println(studentPredicate.test(s1)); // false

        // ye true dega kyuki s2 mein id 2 hai joki 1 se bada hai... 
        System.out.println(studentPredicate.test(s2)); // true
    }

    private static class Student {
        private String name;
        private int id;

        public Student(String name, int id) {
            this.name = name;
            this.id = id;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }
    }
}
