package com.example.junittesting.asserationslass;

import android.os.ParcelUuid;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class moreExample {
    public void methodshouldThrowExeption() throws Exception{
        throw new Exception();
    }

    @Test
    public void fallAsseratioMassage(){
        try {
            methodshouldThrowExeption();
            Assert.fail("Exeption must be thrown");
        }catch (Exception ex){
            Assert.fail("Exaption reased");
        }
    }
    // TODO: 12/16/2024  
/*
    @Test
    public void testassertthat(){
        Assert.assertThat(Arrays.asList("one","tow","three");
    }
    */

}
