package com.softserve.integernumber;


import com.softserve.IntegersNumber.IntNumbers;
import org.junit.Assert;
import org.junit.Test;

public class Test2 {

    @Test
    public void  checkSumFirstFivePositive1(){

        int expected=15;
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        double actual =  IntNumbers.getSum(numbers);
        Assert.assertEquals(expected,actual,0);
    }
    @Test
    public void  checkSumFirstFivePositive2(){

        int expected=10;
        int[] numbers = {-11,2,3,4,1,6,7,8,9,10};

        double actual =  IntNumbers.getSum(numbers);
        Assert.assertEquals(expected,actual,0);
    }
    @Test
    public void  checkSumFirstFivePositive3(){

        int expected=0;
        int[] numbers = {-11,-2,-3,-4,-1,6,7,8,9,10};

        double actual =  IntNumbers.getSum(numbers);
        Assert.assertEquals(expected,actual,0);
    }


    @Test
    public void  checkProductLastFiveNegative1(){

        int expected=0;
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        double actual =  IntNumbers.getProduct(numbers);
        Assert.assertEquals(expected,actual,0);
    }
    @Test
    public void  checkProductLastFiveNegative2(){

        int expected=-10;
        int[] numbers = {1,2,3,4,5,6,7,8,9,-10};

        double actual =  IntNumbers.getProduct(numbers);
        Assert.assertEquals(expected,actual,0);
    }
    @Test
    public void  checkProductLastFiveNegative3(){

        int expected=-180;
        int[] numbers = {1,2,3,4,5,-2,-1,-1,-9,-10};

        double actual =  IntNumbers.getProduct(numbers);
        Assert.assertEquals(expected,actual,0);
    }


}


