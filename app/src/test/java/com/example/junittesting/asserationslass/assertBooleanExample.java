package com.example.junittesting.asserationslass;

import org.junit.Assert;
import org.junit.Test;

public class assertBooleanExample {

    @Test
    public void assertTrue(){
        Assert.assertTrue(5>4); }
    @Test
    public void assertTrueMassage(){
        Assert.assertTrue("conndition should be true",4<6); }
    @Test
    public void assertFalse(){
        Assert.assertFalse(2==0);
    }
    @Test
    public void assertFalseMassage(){
        Assert.assertFalse("condition should be true",2==0);
    }

}
