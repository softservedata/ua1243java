package com.softserve.edu.orest.New.hw13;

import java.util.function.*;

public class StringValidatorSolution {

    public static final Predicate<String> IS_VALID = s -> s != null && !s.isEmpty() && s.length() >= 5;

    public static boolean validate(String s) {
        return IS_VALID.test(s);
    }

}