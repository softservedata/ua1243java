package com.softserve.edu08in;

public interface IA {
    //int getI(); // public abstract
    default int getI() {
        return 0;
    }
}
