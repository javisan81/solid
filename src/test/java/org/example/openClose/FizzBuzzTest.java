package org.example.openClose;

import org.junit.jupiter.api.Test;
import static org.example.openclose.FizzBuzz.fizzbuzz;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class FizzBuzzTest {

    @Test
    public void oneNumber() {
        assertThat(fizzbuzz(1, 1), equalTo("1"));
    }

    @Test
    public void twoNumbers() {
        assertThat(fizzbuzz(1, 2), equalTo("1,2"));
    }

    @Test
    public void theeNumbers() {
        assertThat(fizzbuzz(1, 3), equalTo("1,2,Fizz"));
    }

    @Test
    public void fiveNumbers() {
        assertThat(fizzbuzz(1, 5), equalTo("1,2,Fizz,4,Buzz"));
    }

    @Test
    public void sixNumbers() {
        assertThat(fizzbuzz(1, 6), equalTo("1,2,Fizz,4,Buzz,Fizz"));
    }

    @Test
    public void tenNumbers() {
        assertThat(fizzbuzz(1, 10), equalTo("1,2,Fizz,4,Buzz,Fizz,7,8,Fizz,Buzz"));
    }

    @Test
    public void fifteenNumbers() {
        assertThat(fizzbuzz(1, 15), equalTo("1,2,Fizz,4,Buzz,Fizz,7,8,Fizz,Buzz,11,Fizz,Fizz,14,FizzBuzz"));
    }

    @Test
    public void ThirteenNumbers() {
        assertThat(fizzbuzz(1, 13), equalTo("1,2,Fizz,4,Buzz,Fizz,7,8,Fizz,Buzz,11,Fizz,Fizz"));
    }

    @Test
    public void TwentyThreeNumbers() {
        assertThat(fizzbuzz(1, 23), equalTo("1,2,Fizz,4,Buzz,Fizz,7,8,Fizz,Buzz,11,Fizz,Fizz,14,FizzBuzz,16,17,Fizz,19,Buzz,Fizz,22,Fizz"));
    }

    @Test
    public void FiftyOneNumbers() {
        assertThat(fizzbuzz(56, 56), equalTo("Buzz"));
    }

    @Test
    public void FiftyThreeNumbers() {
        assertThat(fizzbuzz(53, 53), equalTo("FizzBuzz"));
    }
}
