package org.example.openclose;


public class FizzBuzz {

    public static String fizzbuzz(int startRange, int endRange){
        StringBuilder fizzBuzzResults = new StringBuilder();
        for (int i = startRange; i <= endRange; i++) {
            String separator = ",";
            if (i == startRange)
                separator = "";
            String numberInFizzBuzzFormat;
            if(i%3 ==0 && i%5==0 || (contains(i, "3") && contains(i, "5"))) {
                numberInFizzBuzzFormat="FizzBuzz";
            }else if(i%3==0 || contains(i, "3")){
                numberInFizzBuzzFormat="Fizz";
            }else if(i%5==0 || contains(i, "5")) {
                numberInFizzBuzzFormat="Buzz";
            }else{
                numberInFizzBuzzFormat=Integer.toString(i);
            }
            fizzBuzzResults.append(separator).append(numberInFizzBuzzFormat);
        }

        return fizzBuzzResults.toString();
    }

    private static boolean contains(int number, String numberContainedInOtherNumber){
        return Integer.toString(number).contains(numberContainedInOtherNumber);
    }
}
