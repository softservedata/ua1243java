package com.softserve.edu25lambda;

interface Vehicle1 {
    static void blowHorn() {
        System.out.println("Blowing horn!!!");
        //print(); // Compile Error
    }

    default void print() {
        System.out.println("I am a vehicle!");
        //blowHorn();
    }

}

interface FourWheeler {
    default void print() {
        System.out.println("I am a four wheeler!");
    }

}

public class Appl implements  Vehicle1, FourWheeler {

    public void print() {
        Vehicle1.super.print();
    }

    public void my() {
        //Vehicle1.super.print();
        print();
        FourWheeler.super.print();
    }

    public static void main(String[] args) {
        Vehicle1.blowHorn();
        new Appl().my();
    }
}
