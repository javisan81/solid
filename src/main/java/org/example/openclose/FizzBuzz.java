package org.example.openclose;


public class FizzBuzz {

    public static String fizzbuzz(int startRange, int endRange) {
        StringBuilder fizzBuzzResults = new StringBuilder();
        for (int i = startRange; i <= endRange; i++) {
            String separator = ",";
            if (i == startRange)
                separator = "";
            String numberInFizzBuzzFormat = Strategy.createStrategies().stream().filter(strategy -> strategy.matches(i)).findFirst();

            fizzBuzzResults.append(separator).append(numberInFizzBuzzFormat);
        }

        return fizzBuzzResults.toString();
    }

    private static boolean contains(int number, String numberContainedInOtherNumber) {
        return Integer.toString(number).contains(numberContainedInOtherNumber);
    }
}
