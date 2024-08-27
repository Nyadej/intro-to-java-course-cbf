package com.cbfacademy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlowControlExercises {

    public List<String> fizzBuzz(List<Integer> numbers) {
        //  it creates a list where for each element of the input list ${numbers}
       List<String> element = new ArrayList<>(); // didn't think of this
       for (int num : numbers) {
        if (num % 5 == 0 && num % 3 == 0) { //  - if the ${element} is divisible by 3, it adds “Fizz” to the list
            element.add("FizzBuzz");
        } else if (num % 5 == 0) { //  - if the ${element} is divisible by 5, it adds “Buzz” to the list
                element.add("Buzz");
            } else if (num % 3 == 0) { //  - if the ${element} is divisible by both 3 and 5, it adds “FizzBuzz” to the list
                    element.add("Fizz"); //  - it adds the element to the list in any other case
                } else {
                    element.add(String.valueOf(num)); 
                }
            }
            return element; //  - it returns the constructed list. Return must always be outide the for loop
       }
        

    public String whichMonth(Integer number) {
        //  - it returns the month corresponding to the input ${number}
            switch (number) {
            case 1: // no need to add if (number >=1 && number <=12) because this has already been handled by the switch
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

    public Map<String, Integer> sumOfOddsAndSumOfEvens() {
        //  - creates and initialises a list of 100 numbers - from 1 to 100
       List<Integer> sumOfList = new ArrayList<>(100); //specifies initial capacity of the list
        //List<Integer> ret = IntStream.rangeClosed(1, 100).boxed().collect(Collectors.toList()); 
        int sumOfEvens = 0;
        int sumOfOdds = 0;
        for(int i =1 ; i <= 100; i++){
            sumOfList.add(i);
            }
    
        for (int i : sumOfList) {
            if (i % 2 ==0) {
                sumOfEvens += i; //  - determines the sum of all the even numbers in the list
            } else {
                sumOfOdds += i; //  - determines the sum of all the odd numbers in the list
            }
        }
        //for (int i = 1; i <= 100; i++) { //  - determines the sum of all the even numbers in the list
            //sumOfList.add(i); (not needed as it relates to the list that has been commented out)
         
        
        Map<String, Integer> sumsMap= new HashMap<>();

        sumsMap.put("SumOfEvens", sumOfEvens);
        sumsMap.put("SumOfOdds", sumOfOdds);

        return sumsMap; //  - returns a map with two entries:
    }

    public List<Integer> reverse(ArrayList<Integer> numbers) {
        int length = numbers.size();
        List<Integer> reverseList = new ArrayList<>(length);
        for (int i = length -1; i >= 0; i--){
            reverseList.add(numbers.get(i));
        }
        return reverseList; //  - it returns the list in reverse order
    }

    public String getName() {
        return "Flow Control Exercises";
    }
}