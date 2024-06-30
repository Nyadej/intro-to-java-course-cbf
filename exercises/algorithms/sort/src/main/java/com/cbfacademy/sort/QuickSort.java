package com.cbfacademy.sort;
import java.util.ArrayList;

public class QuickSort implements ArraySorter { //why?

    public static void main(String args[]) {

        int[] array = {8, 2, 5, 3, 9, 4, 7, 6, 1};

        quickSort(array, 0, array.length - 1); // including beginning and ending indices of the array
        
        for(int i : array){ //for loop to iterate and display elements of the array
            System.out.print(i + " ");
        }
    }

    private static void quickSort(int[] array, int startIndex, int endIndex) { //declaring quickSort's function

        if(endIndex <= startIndex) return; //base case

        int pivot = partition(array, startIndex, endIndex); /*to find the location of where to pivot, partition function will be in charge of this
                                    partition will sort the array and find the pivot
                                    all elements to the left will be smaller than the pivot
                                    all elements to the right will be bigger than the pivot */
        quickSort(array, startIndex, pivot - 1); //using pivot-1 instead of endIndex because I do not want to include the pivot + // when we know where the parition will be, we can pass in each partition recursively back into the quick sort function
        quickSort(array, pivot + 1, endIndex); //using quickSort on the right partition. Using pivot+1 because the pivot is already here/in place
    }

    private static int partition(int[] array, int startIndex, int endIndex) { //partition function to help the above function
         
        int pivot = array[endIndex]; //pivot is at the end, it will always be at the end
        int i = startIndex - 1;

        for(int j = startIndex; j <= endIndex - 1; j++) { //iterate through the array, continuing the loop as long as..
            if(array[j] < pivot) { //if array at index j is less that pivot, its to be put on the right hand side
                i++; //if the above is true, incrememnt i by 1 and do a variable swap
                int temp = array[i]; //performing variable swap
                array[i] = array[j];
                array[j] = temp;
            }
        }

        i++; //once all the elements that are less than the pivot are on the left hand side, and all elements that are larger than the pivot are the right hand side, increment i by 1 and insert the pivot into its final resting place 
        int temp = array[i]; //performing variable swap
        array[i] = array[array[endIndex]];
        array[endIndex] = temp;

        return i; //will return an int/i which is the location of the pivot
    }

}