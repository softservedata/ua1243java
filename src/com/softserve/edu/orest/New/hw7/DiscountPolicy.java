package com.softserve.edu.orest.New.hw7;

public interface DiscountPolicy {
    double applyDiscount(double price);
    boolean isApplicable(CustomerType type);
}
