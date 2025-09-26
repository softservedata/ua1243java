package com.softserve.edu.orest.New.hw7;

abstract class Staff extends Person{

    public Staff(String name) {
        super(name);
    }

    abstract int salary();
}
