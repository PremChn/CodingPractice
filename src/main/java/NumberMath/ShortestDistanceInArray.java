package NumberMath;

import java.util.Scanner;

/*Find the smallest distance between two neighboring numbers in an array
Implement a Java function that finds two neighboring numbers in an array with the smallest distance to each other.
The function should return the index of the first number. In the sequence 4 8 6 1 2 9 4 the minimum distance is 1
(between 1 and 2). The function should return the index 3 (of number 1). */

public class ShortestDistanceInArray {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = in.nextInt();
        int[] sourceArray = new int[n];
        System.out.println("Enter array elements");
        for(int i = 0; i < n; i++){
            sourceArray[i] = in.nextInt();
        }
        System.out.println("Array index of smallest distance: " + ShortestDistance(sourceArray));
    }

    public static int ShortestDistance(int[] arr){
        int last = 0;
        int j, leastDifferenceAddress;
        if(arr[0] >= arr[1]){
            last = arr[0] - arr[1];
            leastDifferenceAddress = 1;
        }else{
            last = arr[1] - arr[0];
            leastDifferenceAddress = 0;
        }
        for(j = 1; j < arr.length - 1; j++){
            if(arr[j] >= arr[j+1]){
                if((arr[j] - arr[j+1]) < last ){
                    last = arr[j] - arr[j+1];
                    leastDifferenceAddress = j + 1;
                }
            }else{
                if((arr[j+1] - arr[j]) < last){
                    last = arr[j+1] - arr[j];
                    leastDifferenceAddress = j;
                }
            }
        }
        return leastDifferenceAddress;
    }
}