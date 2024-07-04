package com.cbfacademy.sort;

public class QuickSort implements ArraySorter { //QuickSort should implement ArraySorter interface and provide the actual sorting code

    @Override
    public void sort(int[] array, int startIndex, int endIndex) {
        quickSort(array, startIndex, endIndex); //call the quickSort method to sort the array
    }

    //main quickSort method that performs the sorting
    private void quickSort(int[] array, int startIndex, int endIndex) { //declaring quickSort's function
            
        if(endIndex <= startIndex) return; //base case - if the end index is greater than or equal to the starting index, do nothing

        int pivot = partition(array, startIndex, endIndex); /*to find the location of where to pivot, partition function will be in charge of this
                                    partition will sort the array and find the pivot
                                    all elements to the left will be smaller than the pivot
                                    all elements to the right will be bigger than the pivot */
        quickSort(array, startIndex, pivot - 1); //using pivot-1 instead of endIndex because I do not want to include the pivot + // when we know where the parition will be, we can pass in each partition recursively back into the quick sort function
        quickSort(array, pivot + 1, endIndex); //using quickSort on the right partition. Using pivot+1 because the pivot is already here/in place
    }

    private int partition(int[] array, int startIndex, int endIndex) { //this method partitions the array around a pivot
         
        int pivot = array[endIndex]; //choose the pivot as the last element in the array
        int i = startIndex - 1; // initialise the index of the smaller element

        for(int j = startIndex; j <= endIndex - 1; j++) { //loop through the array, continuing the loop from startIndex to endIndex as long as..
            if(array[j] < pivot) { //if element at index j is less that pivot, its to be put on the left hand side
                i++; //to do the above, incrememnt i by 1 and do a variable swap
                int temp = array[i]; //performing variable swap
                array[i] = array[j];
                array[j] = temp;
            }
        }

        i++; //once all the elements that are less than the pivot are on the left hand side, and all elements that are larger than the pivot are the right hand side, increment i by 1 and insert the pivot into its final resting place 
        int temp = array[i]; //performing variable swap
        array[i] = array[endIndex];//error here
        array[endIndex] = temp;

        return i; //will return an int/i which is the location of the pivot
    }

}
