package me.learning.day07;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Function2 {
    public static void main(String[] args) {

        // Function to get the length of a string
        Function<String, Integer> function1 = x -> x.length();

        // Function to get the first 3 characters of a string
        Function<String, String> function2 = s -> s.substring(0, 3);

        // Function that filters students whose name starts with "vip" (case insensitive)
        Function<List<Student>, List<Student>> studentsWithVipAsPrefix = li -> {
            List<Student> result = new ArrayList<>();
            for (Student s : li) {
                if (function2.apply(s.getName()).equalsIgnoreCase("vip")) {
                    result.add(s);
                }
            }
            return result;
        };

        // Creating student objects
        Student s1 = new Student(2, "Vipul");
        Student s2 = new Student(2, "Vipulav");
        Student s3 = new Student(2, "Arnav");

        // Adding students to list
        List<Student> students = Arrays.asList(s1, s2, s3);

        // Applying the filter function
        List<Student> filteredStudents = studentsWithVipAsPrefix.apply(students);

        // Printing the filtered students
        // jab hum filteredStudents ko print kar rahe hai to wo internally har object ko call
        // kr raha hai to toString method call ho raha hai tabhi print karega student ka details

        System.out.println(filteredStudents);
    }

    // Student class with id and name
    private static class Student {
        private int id;
        private String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        // Overriding toString to print student details
        @Override
        public String toString() {
            return "Student{id=" + id + ", name='" + name + "'}";
        }
    }
}
