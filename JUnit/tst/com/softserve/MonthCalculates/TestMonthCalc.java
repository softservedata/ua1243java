package com.softserve.MonthCalculates;


import org.junit.Assert;
import org.junit.Test;

public class TestMonthCalc {


    @Test
    public void  checkMonthResult1()  {

        String expected="December - 31 days";
        int numberOfMonth = 12;


        String actual = Months.monthCalculates(numberOfMonth);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void  checkMonthResult2() {

        String expected="January - 31 days ";
        int numberOfMonth = 1;


        String actual = Months.monthCalculates(numberOfMonth);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void  checkMonthResult3()  {

        String expected= "it is not correct value!";
        int numberOfMonth = 13;


        String actual = Months.monthCalculates(numberOfMonth);
        Assert.assertEquals(expected,actual);
    }
}
