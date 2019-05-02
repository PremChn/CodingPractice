package Sorting;

public class QuickSort {
    private int[] input;
    private int length;

    public void sort(int[] numbers){
        if(numbers == null || numbers.length == 0){
            return;
        }
        this.input = numbers;
        length = numbers.length;
        quickSort(0, length - 1);
    }

    //This methods implements quick sort algorithm recursively.
    private void quickSort(int low, int high){
        int i = low;
        int j = high;

        //To get pivot from the array (pivot is middle number)
        int pivot = input[low + (high - low) / 2];

        //divide into two arrays
        while( i <= j){
            /*In each iteration, we will identify a number from left side which is
            greater than the pivot value, and a number from right side which is
            less than the pivot value. Once search is complete, we can swap both numbers.*/

            while(input[i] < pivot){
                i++;
            }

            while(input[j] > pivot){
                j--;
            }

            if(i <= j){
                swap(i, j);
                //move index to next position on both sides
                i++;
                j--;
            }
        }

        //calling quicksort() method recursively.
        if(low < j){
            quickSort(low, j);
        }

        if(i < high){
            quickSort(i, high);
        }
    }

    private void swap(int i, int j){
        int temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }

}