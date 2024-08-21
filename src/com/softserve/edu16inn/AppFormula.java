package com.softserve.edu16inn;

interface IFormula {
    double calculate(int a); // public abstract by default;

    default double sqrt(int a) {
        return Math.sqrt(a);
    }
}

/*
class CFormula implements IFormula {
    @Override
    public double calculate(int a) {
        return sqrt(a * 5);
    }
}
*/

public class AppFormula {
    public static void main(String[] args) {
        // /*
        IFormula formula = new IFormula() {
            @Override
            public double calculate(int a) {
                return sqrt(a * 5);
            }
        };
        // */
        //IFormula formula = new CFormula();
        //
        double result = formula.calculate(20);
        System.out.println("Square root of 100 is " + result);
        //
        //AppFormula$1 a2;
    }
}
