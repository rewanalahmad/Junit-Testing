package com.example.junittesting;

public class EmployeeServerDetile {

    public double calculateyearsalary(Employee employee) {
        double yearsalary = 0;
        yearsalary = employee.getMounthsalary() * 12;
        return yearsalary;
    }

    public double calculateemployeeApprasial(Employee employee) {
        if (employee.getMounthsalary() < 100000) {
            return 500.0;
        }
        else {
            return 1000.0;
        }


    }
}
