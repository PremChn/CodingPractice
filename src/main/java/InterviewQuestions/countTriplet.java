package InterviewQuestions;

import com.sun.istack.internal.NotNull;

import java.util.Arrays;

/*Please write a class to find count of triplets with sum smaller than given sum value.

- You should have a method to return the total count of count of triplets
- You should have a method to return the count of triplets

Note, please consider the time complexity of O(n2)

Examples of given an array and a sum value input data:

Input : arr[] = {-2, 0, 1, 3}
        sum = 2.
Output : 2
Explanation :  Below are triplets with sum less than 2
               (-2, 0, 1) and (-2, 0, 3)

Input : arr[] = {5, 1, 3, 4, 7}
        sum = 12.
Output : 4
Explanation :  Below are triplets with sum less than 12
               (1, 3, 4), (1, 3, 5), (1, 3, 7) and
               (1, 4, 5)*/

public class countTriplet {
    public static void main(String args[]){
        int[] arr = {5, 1, 3, 4, 7};
        int sum = 12;
        System.out.println(tripletCount(arr, sum));
    }

    public static int tripletCount(@NotNull int arr[], int sum){
        int arrlength = arr.length;
        int count = 0;

        //sort the array
        Arrays.sort(arr);

        //Every iteration of loop counts triplets with first element as arr[i]
        for(int i = 0; i < arrlength - 2; i++){
            //initialize other two elements as corner elements of subarray arr[j+1...k]
            int j = i + 1;
            int k = arrlength - 1;

            //use meet in the middle concept
            while(j < k){
                //if some of current triplet is more or equal,
                //move right corner to look for smaller values
                if(arr[i] + arr[j] + arr[k] >= sum){
                    k--;
                }
                //else move left corner
                else{
                    //This is important. For current i and j, there
                    //can be total k-j third elements.
                    count += (k - j);
                    j++;
                }

            }
        }
        return count;
    }
}
