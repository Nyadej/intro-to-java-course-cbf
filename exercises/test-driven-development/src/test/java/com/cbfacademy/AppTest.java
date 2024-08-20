package com.cbfacademy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

@DisplayName(value = "Basic Test Suite")
public class AppTest {

    @Test
    @DisplayName("creates the app")
    public void createsAnApp() {
        final App app = new App();
        assertThat(app, is(notNullValue()));

    }

    @Test
    @DisplayName("return 'FizzBuzz' when the input is divisible by 15")
    public void fizzBuzzTest() {
        assertEquals("FizzBuzz", FizzBuzz.get(15));
    }

    @Test
    @DisplayName("return 'Fizz' when the input is divisible by 3")
    public void fizzTest() {
        assertEquals("1", FizzBuzz.get(1));
        assertEquals("2", FizzBuzz.get(2));
        assertEquals("Fizz", FizzBuzz.get(3));
        assertEquals("4", FizzBuzz.get(4));

    }

    @Test
    @DisplayName("return 'Buzz' when the input is divisible by 5")
    public void buzzTest() {
        assertEquals("Buzz", FizzBuzz.get(5));
        assertEquals("Fizz", FizzBuzz.get(6));
        assertEquals("7", FizzBuzz.get(7));
        assertEquals("8", FizzBuzz.get(8));
        assertEquals("Fizz", FizzBuzz.get(9));
        assertEquals("Buzz", FizzBuzz.get(10));
        assertEquals("11", FizzBuzz.get(11));
        assertEquals("Fizz", FizzBuzz.get(12));
        assertEquals("13", FizzBuzz.get(13));
        assertEquals("14", FizzBuzz.get(14));
        }

}