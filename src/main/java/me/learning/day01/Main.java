package me.learning.day01;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // this is the normal way to do this but when we have
        // functional interface then we can use lambda expression.
//        SoftwareEngineer employee = new SoftwareEngineer();
//        System.out.println(employee.getName());

        
        // here we use lambda expression so that this software engineer is
        // set in the getName so that we can get with employee.getName();
        // lambda expression is nothing but the implementation of that
        // single method that is present in the employee class.
        Employee employee = () -> "Software Engineer";
        System.out.println(employee.getName());
    }
}