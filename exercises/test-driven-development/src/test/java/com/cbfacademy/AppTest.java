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
    @DisplayName("return 'Fizz' when the input is divisible by 3")
    public void printsFizz() {
        assertEquals("1", FizzBuzz.get(1));
        assertEquals("2", FizzBuzz.get(2));
        assertEquals("Fizz", FizzBuzz.get(3));
        assertEquals("4", FizzBuzz.get(4));
    }

    @Test
    @DisplayName("return 'Buzz' when the input is divisible by 5")
    public void printsBuzz() {
        assertEquals("Buzz", FizzBuzz.get(5));
        }

}