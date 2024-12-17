package com.example.junittesting.asserationslass;

import org.junit.Assert;
import org.junit.Test;

import java.net.PortUnreachableException;

public class assertObjectExamble {
    @Test
    public void assertNull(){
        String object=null;
        Assert.assertNull(object);}
    @Test
    public void assertNullwithmassage(){
        String object=null;
        Assert.assertNull("object should be null",null);
    }
    @Test
    public void assertNotNull(){
        String object="heloo";
        Assert.assertNotNull(object);
    }
    @Test
    public void testSameAssert(){
        String a1="rewan";
        String a2="rewan";
        Assert.assertSame(a1,a2);
    }
    @Test
    public void testNotSameAssert(){
        String a1="rewa";
        String a2="rewan";
        Assert.assertNotSame(a1,a2);
    }



}
