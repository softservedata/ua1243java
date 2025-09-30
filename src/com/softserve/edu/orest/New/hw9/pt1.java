package com.softserve.edu.orest.New.hw9;

public class pt1 {
    public static void main(String[] args) {
        Department departmentOrig = new Department("IT", new Department.Address("Rivne", "soborna", 18));
        Department departmentClone = departmentOrig.clone();

        System.out.println("departmentOrig" + departmentOrig);
        System.out.println("departmentClone" + departmentClone);
        departmentClone.address.city = "Lviv";
        System.out.println("departmentOrig" + departmentOrig);
        System.out.println("departmentClone" + departmentClone);
    }
}
