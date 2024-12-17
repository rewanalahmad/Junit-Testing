package com.example.junittesting;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BasicExampleTest {

    @Before
    public void setUp() throws Exception {
        System.out.println("inside setup method");
    }

    @Test
    public void printMassage() {
            String expactedmassage="heloo world";
            BasicExample util= new BasicExample(expactedmassage);
            String actualmassage= util.printMassage();
            Assert.assertEquals("Actual is not like expected massage",
                    expactedmassage,expactedmassage);
        }
    }
