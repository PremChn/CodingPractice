package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class sibilings {
    public static void main(String args[]) {
        //generate random number
        int number = 353;

        //String numStr = number + "";
        String numStr = Integer.toString(number);
        char[] numCharArr = numStr.toCharArray();
        int[] numArr = new int[numStr.length()];

        for(int i = 0 ; i < numCharArr.length ; i ++) {
            numArr[i] = Integer.parseInt(numCharArr[i] + "");
        }

        for(int lastUnsortedIndex = numArr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            int largestIndex = 0; //we assume that largest value is at index 0
            for(int j = 1; j <= lastUnsortedIndex; j++){
                if(numArr[j] < numArr[largestIndex]){
                    largestIndex = j;
                }
            }
            //swap(array, largestIndex, lastUnsortedIndex);
            int temp = numArr[largestIndex];
            numArr[largestIndex] = numArr[lastUnsortedIndex];
            numArr[lastUnsortedIndex] = temp;
        }


   /*     // Sort in descending order
        for(int i = 0 ; i < numArr.length ; i ++) {
            for(int j = 0 ; j < i ; j ++) {

                if(numArr[i] > numArr[j]) {
                    // swap
                    int temp = numArr[i];
                    numArr[i] = numArr[j];
                    numArr[j] = temp;
                }

            }
        }*/

        String largestNumber = "";
        for(int i : numArr) {
            largestNumber += i;
        }

        System.out.println("The largest number is : " + largestNumber);
    }

}
