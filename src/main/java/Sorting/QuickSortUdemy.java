package Sorting;

public class QuickSortUdemy {
    public static void main(String args[]) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        quickSort(intArray, 0, intArray.length);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void quickSort(int[] input, int start, int end) {
        //To check whether the array has more than one element
        if (end - start < 2) {
            return;
        }

        //to get pivot
        int pivotIndex = partition(input, start, end);
        quickSort(input, start, pivotIndex);
        quickSort(input, pivotIndex + 1, end);
    }

    public static int partition(int[] input, int start, int end) {
        //This is using first element as pivot
        int pivot = input[start];
        int i = start;
        int j = end;

        //first while loop is to check whether i is not cross j
        while (i < j) {
            //Note: empty loop
            while (i < j && input[--j] >= pivot);
                if (i < j) {
                    input[i] = input[j];
                }
            //Note: empty loop
            while (i < j && input[++i] <= pivot);
                if (i < j) {
                    input[j] = input[i];
                }

        }
        input[j] = pivot;
        return j;
    }
}