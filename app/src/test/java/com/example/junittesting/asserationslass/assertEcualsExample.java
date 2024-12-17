package com.example.junittesting.asserationslass;
import org.junit.Assert;
import org.junit.Test;

public class assertEcualsExample {
    String actualdata=" data";
    String expexteddata="test data";
    @Test
    public void testequalparameter(){
//compare string
        Assert.assertEquals(expexteddata,actualdata);
        //compare Double
    Assert.assertEquals(2.0,2.0,0);
    //compare Integar
   Assert.assertEquals(5,5);
   //compare Float
    Assert.assertEquals(2.4f,2.4f);  }


    @Test
    public void testequalsparamiterswithmassage(){
        Assert.assertEquals("data should match",actualdata,expexteddata);
        Assert.assertEquals("data should match",2.4f,204f);
        Assert.assertEquals("data should match",5,5);

    }
}
