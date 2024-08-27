package com.cbfacademy;

public class Leap {
    
    public static boolean isLeap(int year) {
        if (year % 400 == 0) {
            return true;
        }
        return false;
    }
}
