package com.cbfacademy;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


@DisplayName(value = "Leap Year Testing")
public class LeapTest {

    @Test
    @DisplayName("years divisible by 400 are leap years")
    public void divisibleBy400() {
        assertTrue(Leap.isLeap(2000));
    }

    @Test
    @DisplayName("years divisible by 100 but not by 400 are not leap years")
    public void divisibleBy100() {
        assertFalse(Leap.isLeap(1900));
    }

    @Test
    @DisplayName("years divisible by 4 but not by 100 are leap years")
    public void divisibleBy4() {
        assertTrue(Leap.isLeap(2008));
    }

    @Test
    @DisplayName("years not divisible by 4 are not leap years")
    public void notDivisibleBy4() {
        assertFalse(Leap.isLeap(2017));
    }

}