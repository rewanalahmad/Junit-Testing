package com.example.junittesting;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

import androidx.collection.PackingUtilsKt;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class ExampleUnitTest {

    @BeforeClass
    public static void Bclass (){System.out.println("befor the class");}

    @Before
    public void Btest(){System.out.println("befor the test");}


    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test(expected = Exception.class)
    public void massagetest() throws Exception
    {System.out.println("print the test");
        throw new Exception("Exeption Throwen");  }

    @Ignore("Ignore this sup test")
    @Test
    public void sub_iscoorect(){assertEquals(5,6-1);}

    @Test(timeout = 100000)
    public void testExample() throws InterruptedException{
        System.out.println("runing test method");
      Thread.sleep(2000);  }

    @After
    public void Atest(){System.out.println("after the test");}

    @AfterClass
    public static void Aclass(){System.out.println("after the class");}

}
/*
@RunWith(Parameterized.class)
 public class ParameterizedTest {

    @Parameterized.Parameter
    public  Integer counter;


    @Parameterized.Parameters
    public static List<Integer> counterIncrementer() {
        return Arrays.asList(1,2,3,4,5);
    }
    @Test
    public void parameterExamble(){
 System.out.println("counter value:"+counter);  }
}     */


