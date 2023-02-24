package org.example.openclose;

import java.util.List;

interface Strategy {
    default boolean contains(int number, String numberContainedInOtherNumber) {
        return Integer.toString(number).contains(numberContainedInOtherNumber);
    }

    boolean matches(int numberToCalculate);
    String numberAsString();

    static List<Strategy> createStrategies(){
        return List.of(new FizzBuzzStrategy());
    }
}
