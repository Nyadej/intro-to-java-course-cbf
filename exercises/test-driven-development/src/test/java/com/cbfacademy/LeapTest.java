package com.cbfacademy;


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

}