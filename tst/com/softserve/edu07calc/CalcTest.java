package com.softserve.edu07calc;

import org.junit.Assert;
import org.junit.Test;

public class CalcTest {

    @Test
    public void checkAdd1() {
        Calc calc = new Calc();
        double actual;
        double expected = 10.0001;
        //
        actual = calc.add(5, 5);
        Assert.assertEquals(expected, actual, 0.001);
        //
    }

    @Test
    public void checkAdd2() {
        Calc calc = new Calc();
        double actual;
        double expected = 10.0001;
        //
        actual = calc.add(4, 6);
        Assert.assertEquals(expected, actual, 0.001);
        //
    }

    @Test
    public void checkDiv1() {
        Calc calc = new Calc();
        double actual;
        double expected = 4.0001;
        //
        actual = calc.div(20, 5);
        Assert.assertEquals(expected, actual, 0.001);
        //
    }

    @Test
    public void checkDiv2() {
        Calc calc = new Calc();
        double actual;
        double expected = 2.5001;
        //
        actual = calc.div(20, 8);
        Assert.assertEquals(expected, actual, 0.001);
        //
    }
}
