package com.example.junittesting;

public class Employee {
    String name;
    int age;
    double mounthsalary;


    public double getMounthsalary() {
        return mounthsalary;
    }

    public void setMounthsalary(double mounthsalary) {
        this.mounthsalary = mounthsalary;
    }
    public Employee(String name,int age,double mounthsalary) {
        this.name = name;
        this.age=age;
        this.mounthsalary=mounthsalary;
    }
    

}
