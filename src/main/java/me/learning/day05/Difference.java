package me.learning.day05;

public class Difference {
    int x = 42;  // Instance variable of Main class

    private void doSomething() {
        int x = 10; // Local variable inside doSomething()

        // Lambda expression
        Employee employee = () -> {
            System.out.println(x); // this refers to the local variable 10
            System.out.println(this.x); // Refers to Main's x (i.e., 42)
            return "100";
        };

        // Anonymous inner class
       Employee employee1 = new Employee() {
            int x = 10; // This x is part of anonymous inner class

            @Override
            public String getSalary() {
                System.out.println(this.x); // Refers to anonymous inner class's x (i.e., 10)
                return "100";
            }
        };

        employee.getSalary();   // prints 42
        employee1.getSalary();  // prints 10
    }

    public static void main(String[] args) {
        new Difference().doSomething();
    }
}

