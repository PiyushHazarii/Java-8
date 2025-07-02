package me.learning.day04;

public class Diefference {
    public static void main(String[] args) {

//        this is the normal way to do this
//        EmployeeIMPL employeeIMPL = new EmployeeIMPL();
        // this is the normal way to use the implement class we
        // can also use it with the annonymous class
        // but we cannot use here lamda function beacuse
        // it will only work when the interfase is a functional interface
        // this is the difference of lamda expression and annonymous class


        // now the use of annonymous class
        Employee employee = new Employee() {
            @Override
            public String getSalary() {
                return "100";
            }

            @Override
            public String getDesignation() {
                return "SE";
            }
        };

        System.out.println(employee.getDesignation());
    }
}
