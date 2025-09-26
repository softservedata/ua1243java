package com.softserve.edu.orest.New.hw7;

interface NumberTransformer {
    int transform(int number);

    boolean canTransform(int number);
}

class EvenDoubler implements NumberTransformer {
    public EvenDoubler() {
    }

    public int transform(int n) {
        return n = n * 2;
    }

    public boolean canTransform(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}

class OddSquarer implements NumberTransformer {

    public OddSquarer() {
    }

    @Override
    public int transform(int n) {
        return n * n;
    }

    @Override
    public boolean canTransform(int n) {
        return n % 2 != 0;
    }
}

class RangeNegator implements NumberTransformer {
    public RangeNegator() {
    }

    @Override
    public int transform(int n) {
        return -n;
    }

    @Override
    public boolean canTransform(int n) {
        if (n >= -10 && n <= 10) {
            return true;
        } else {
            return false;
        }
    }
}
