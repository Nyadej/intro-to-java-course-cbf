package com.cbfacademy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlowControlExercises {

    public List<String> fizzBuzz(List<Integer> numbers) {
        // TODO - Implement this method such that
        //  it creates a list where for each element of the input list ${numbers}
       List<String> element = new ArrayList<>(); { // didn't think of this
       for (int num : numbers) {
        if (num % 3 == 0) { //  - if the ${element} is divisible by 3, it adds “Fizz” to the list
            element.add("Fizz");
        } else if (num % 5 == 0) { //  - if the ${element} is divisible by 5, it adds “Buzz” to the list
                element.add("Buzz");
            } else if (num % 5 == 0 && num % 3 == 0) { //  - if the ${element} is divisible by both 3 and 5, it adds “FizzBuzz” to the list
                    element.add("FizzBuzz"); //  - it adds the element to the list in any other case
                } else {
                    element.add(String.valueOf(num)); 
                }
                return element; //  - it returns the constructed list
            }
        }
       }
        

    public String whichMonth(Integer number) {
        // TODO - Implement this method such that
        //  - it returns the month corresponding to the input ${number}
        if (number >=1 && number <=12) {
            switch (number) {
                case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "Invalid month number"; //  - if the ${number} is invalid, the method should return "Invalid month number"
            }
            }
        }

    public Map<String, Integer> sumOfOddsAndSumOfEvens() {
        // TODO - Implement this method such that
        //  - creates and initialises a list of 100 numbers - from 1 to 100
        List<Integer> sumOfList = new ArrayList<>(100); //specifies initial capacity of the list

        int sumOfEvens = 0;
        int sumOfOdds = 0;

        for (int i = 1; i <= 100; i++) { //  - determines the sum of all the even numbers in the list
            sumOfList.add(i);
            if (i % 2 ==0) {
                sumOfEvens += i; //  - determines the sum of all the even numbers in the list
            } else {
                sumOfOdds += i; //  - determines the sum of all the odd numbers in the list
            }
        }
        
        Map<String, Integer> sumsMap= new HashMap<>();

        sumsMap.put("calculatedSumOfEvens", sumOfEvens);
        sumsMap.put("calculatedSumOfOdds", sumOfOdds);

        return sumsMap; //  - returns a map with two entries:
    }

    public List<Integer> reverse(ArrayList<Integer> numbers) {
        // TODO - Implement this method such that
        List<Integer> reverseList = new ArrayList<>();
        reverseList.add(1); //  - it takes an array list of integers
        reverseList.add(2);
        reverseList.add(3);

        
        List<Integer> reverseOrderList = Lists.reverse(reverseList);
        return reverseList; //  - it returns the list in reverse order
    }

    public String getName() {
        return "Flow Control Exercises";
    }
}
