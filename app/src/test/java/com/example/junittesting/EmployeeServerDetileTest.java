package com.example.junittesting;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EmployeeServerDetileTest {
    EmployeeServerDetile employeeServerDetile=new EmployeeServerDetile();
    @Before
    public void setUp() throws Exception {
employeeServerDetile= new EmployeeServerDetile();
    }

    @Test
    public void testcalculateyearsalary() {
        Employee employee=new Employee("rewan",24,1000);
        double actualresult=employeeServerDetile.calculateyearsalary(employee);
        Assert.assertEquals(12000.0,actualresult,0.0);

    }

    @Test
    public void testcalculateemployeeApprasial() {
        Employee employee1=new Employee("ahmad",23,100000);
        double result1=employeeServerDetile.calculateemployeeApprasial(employee1);
        Assert.assertEquals(1000.0,result1,0.1);
        Employee employee2=new Employee("rodi",22,850);
        double result2=employeeServerDetile.calculateemployeeApprasial(employee2);
        Assert.assertEquals(500.0,result2,0.0);


    }



}