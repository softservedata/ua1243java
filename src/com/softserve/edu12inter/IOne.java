package com.softserve.edu12inter;

public interface IOne {
    //void info();
    default void info() {
        System.out.println("from interface IOne");
    }
}
