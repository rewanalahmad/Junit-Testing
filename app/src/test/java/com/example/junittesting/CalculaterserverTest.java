package com.example.junittesting;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculaterserverTest {
    public Calculaterserver server;

    @Before
    public void setUp() throws Exception {
        server=new Calculaterserver();
        System.out.println("this is from setup method");
    }

    @Test
    public void testAddnumbers() {
        int result=server.addnumbers(12,6);
        Assert.assertEquals(18,result);
    }

    @Test
    public void testGetQuotient() {
        Integer actualresult=server.getQuotient(12,6);
        Assert.assertEquals(Integer.valueOf(2),actualresult);
    }
    @Test(expected = ArithmeticException.class)
    public void testGetQuotientExpectaion() {
        server.getQuotient(30,0);
    }

    @Test
    public void testGetRemainder() {
        Integer actualresult=server.getRemainder(35,2);
        Assert.assertEquals(Integer.valueOf(1),actualresult);
    }
    @Test(expected = ArithmeticException.class)
    public void testGetRemainderExpextaion() {
        server.getRemainder(35,0);
    }
}