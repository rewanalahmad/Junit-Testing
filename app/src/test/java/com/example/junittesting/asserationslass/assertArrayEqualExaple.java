package com.example.junittesting.asserationslass;

import android.os.ParcelUuid;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class assertArrayEqualExaple {

    @Test
    public void arrayEqual(){

        //compare String Array
        Assert.assertArrayEquals(new String[]{"rewan","rewan"},
                new String[]{"rewan","rewan"});
        //compare Integar Array
        Assert.assertArrayEquals(Arrays.asList(123,12).toArray(),
                Arrays.asList(123,12).toArray());
        //compare Double Array
        Assert.assertArrayEquals(new double[]{2.3},new double[]{2.3},0.1);


    }
}
