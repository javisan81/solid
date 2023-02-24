package org.example.openclose;

public class FizzBuzzStrategy implements Strategy{
    @Override
    public boolean matches(int numberToCalculate) {
        return numberToCalculate % 3 == 0 && numberToCalculate % 5 == 0 ||
                (contains(numberToCalculate, "3") && contains(numberToCalculate, "5"));
    }

    @Override
    public String numberAsString() {
        return "FizzBuzz";
    }
}
