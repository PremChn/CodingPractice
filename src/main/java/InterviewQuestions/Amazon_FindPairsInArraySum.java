package InterviewQuestions;

/*Find all pairs in Array of integers whose sum is equal to a given number
e.g. a[1,2,3,4] output 5 (Combinations 2+3 and 4+1)
 */

import java.util.Scanner;

public class Amazon_FindPairsInArraySum {
    public static void main(String args[]){
        int finalSum = 5;
        int[] Array = {1,2,3};
        System.out.println(ArrayOfIntegers(Array, finalSum));
        System.out.println(java.util.Arrays.toString(CompareEachElementInArray(Array)));

    }

    public static boolean ArrayOfIntegers(int[] a, int b) throws ArrayIndexOutOfBoundsException{
        //to sum the consecutive array elements and compare the result is equivalent to the target
        for(int i = 0; i < a.length - 1; i++){
            if(a[i] + a[i + 1] == b){
               return true;
            }
        }
        return false;
    }

    public static int[] CompareEachElementInArray(int[] a){
        int sum = 0;
        int tot[] = new int[a.length];
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length - 1; j++){
                sum += a[i] + a[j + 1];
            }
            tot[i] = sum;
            sum = 0;
        }
        return tot;
    }
}