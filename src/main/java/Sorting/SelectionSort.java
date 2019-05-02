package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String args[]){
        int[] array = {20, 35, -15, 7, 55, 1, -22};
        selectionSort(array);
    }

    public static void selectionSort(int[] array){
        System.out.println("Unsorted Array: " + Arrays.toString(array));

        for(int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            int largestIndex = 0; //we assume that largest value is at index 0
            for(int j = 1; j <= lastUnsortedIndex; j++){
                if(array[j] > array[largestIndex]){
                    largestIndex = j;
                }
            }
            swap(array, largestIndex, lastUnsortedIndex);
        }

        System.out.println("Sorted Array: " + Arrays.toString(array));
    }

    public static void swap(int[] a, int start, int end){

        int temp;

        if(start == end){
            return;
        }

        temp = a[start];
        a[start] = a[end];
        a[end] = temp;
    }
}
