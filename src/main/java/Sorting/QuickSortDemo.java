package Sorting;

/*Java Program sort numbers using QuickSort Algorithm. QuickSort is a divide and conquer algorithm,
   which divides the original list, sort it and then merge it to create sorted output.*/

import java.util.Arrays;

public class QuickSortDemo {
    public static void main(String args[]){
        int[] unsorted = {6, 5, 3, 1, 8, 7, 2, 4};
        //int[] unsorted = {3, 5, 2, 1};
        System.out.println("Unsorted Array: " + Arrays.toString(unsorted));

        QuickSort algorithm = new QuickSort();

        //sorting integer array using quick sort.
        algorithm.sort(unsorted);

        //printing sorted array
        System.out.println("Sorted Array: " + Arrays.toString(unsorted));

    }
}