package com.cbfacademy.search;

public class BinarySearch {
    //BINARY SEARCH - finding the position of a target value within a sorted array. 
    /*public static void main(String[] args) {
    
        int array[] = new int[100]; //an array of integers of size 100
        int target = 57; //target value being searched for
    
        for(int i = 0; i < array.length; i++) { //populate the array using a for-loop
            array[i] = i;
        }
    
        int index = search(array, target); //
    
        if(index == -1) { //if target is not found, -1 will be returned
            System.err.println(target + " not found");
        } else {
            System.out.println("Target found at: " + index);
        }
    
    }*/
    
    public int search(int[] array, int target) { //creating binary function with two integers
    
        int low = 0; // beginning index of array
        int high = array.length - 1; // end index of array
    
        while(low <= high) { //continue the loop and keep searching 
    
            int middle = low + (high - low) / 2; // middle index
            int value = array[middle]; // to extract the value calcuated above
    
            System.out.println("middle: " + value); // just to display the middle value (optional)
    
            if(value < target) low = middle + 1;// check to see if value is < / > / = target
            else if (value > target) high = middle - 1;
            else return middle; // target is found
        }
    
            return -1; // target has not been found
        }   
    }