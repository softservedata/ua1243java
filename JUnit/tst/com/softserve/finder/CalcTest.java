package com.softserve.finder;

import org.junit.Assert;
import  org.junit.Test;

public class CalcTest {
@Test
    public void  checkMin(){

        double expected=-1.5;
        double[] numbers = {5.5, 2.2, -1.5, -1.3, 0};

       double actual =  Finder.min(numbers);
        Assert.assertEquals(expected,actual,0.001);
    }

    @Test
    public void  checkMinPosition(){


        int expected=2;
        double[] numbers = {5.5, 2.2, -1.5, -1.3, 0};

        double actual =  Finder.getMinPosition(numbers);
        Assert.assertEquals(expected,actual,0);
    }

    @Test
    public void  checkProduct1(){


        double expected=16;
        double[] numbers = {5, 2, -1, 4, 2};

        double actual =  Finder.findProduct(numbers);
        Assert.assertEquals(expected,actual,0);
    }
    @Test
    public void  checkProduct2(){


        double expected=0;
        double[] numbers = {5.1, 2.2, -1.3, 4.4, 2.1};

        double actual =  Finder.findProduct(numbers);
        Assert.assertEquals(expected,actual,0.001);
    }





}
