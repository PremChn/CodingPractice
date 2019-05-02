package Sorting;

/*As the name suggest, Insertion sort is based upon insertion of an element in a sorted list. To start, we assume that first element is already sorted.
 Then we pick the next element and put it in second place, we compare this number with the first element and if they are not in sorted order, we swap them.
 This gives a new sorted list of 2 elements. Now we pick the third element and put it in the 3rd place and compare it with the 2nd placed number,
 if they are not in sorted order, we swap them again, if all three elements are still not in sorted order then we again swap the 1st and 2nd element,
 now we have a sorted list of three numbers.*/

import java.util.Arrays;

public class InsertionSort {
    public static void main(String args[]){
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        System.out.println("Unsorted array : " + Arrays.toString(intArray));

        insertionSort(intArray);

        System.out.println("Sorted Array : " + Arrays.toString(intArray));
    }

    public static void insertionSort(int intArray[]){
        for(int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++){
            int newElement = intArray[firstUnsortedIndex];
            int i;
            //create right place by moving elements
            for(i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--){

                //move
                intArray[i] = intArray[i - 1];
            }

            //found the right place, insert now
            intArray[i] = newElement;

        }


    }

}
