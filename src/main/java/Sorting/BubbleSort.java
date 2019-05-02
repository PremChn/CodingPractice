package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String args[]){
        //int[] array = { 20, 12, 45, 19, 91, 55 };
        int[] array = {20, 12, 12, -45, 34, 21};
        bubbleSort(array);
    }

    public static void bubbleSort(int[] a){
        System.out.println("Unsorted array: " + Arrays.toString(a));
        for(int lastUnsortedIndex = a.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            for(int j = 0; j < lastUnsortedIndex; j++){
                if(a[j] > a[j + 1]){
                    swap(a, j, j+1);
                }
            }
        }
        System.out.println("Sorted array: " + Arrays.toString(a));
    }

    public static void swap(int[] array, int from, int to){
        if(from == to){
            return;
        }
        int temp = array[from];
        array[from] = array[to];
        array[to] = temp;
    }

}
