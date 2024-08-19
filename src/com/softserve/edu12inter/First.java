package com.softserve.edu12inter;

import java.io.Serializable;

public class First implements IOne, ITwo, Serializable {

    @Override
    public void info() {
        System.out.println("from class First");
    }
}
