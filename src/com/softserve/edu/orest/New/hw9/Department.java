package com.softserve.edu.orest.New.hw9;

public class Department implements Cloneable {
    private String name;
    Address address;

    public Department(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    static class Address implements Cloneable{
        String city;
        String street;
        int building;

        public Address(String city, String street, int building) {
            this.city = city;
            this.street = street;
            this.building = building;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "city='" + city + '\'' +
                    ", street='" + street + '\'' +
                    ", building=" + building +
                    '}';
        }

        @Override
        public Address clone() {
            try {
                return (Address) super.clone();
            } catch (CloneNotSupportedException e) {
                return null;
            }
        }
    }

    @Override
    public Department clone() {
        try {
            var res = (Department) super.clone();
            res.address = address.clone();
            return res;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
