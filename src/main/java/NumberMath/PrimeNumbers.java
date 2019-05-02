package NumberMath;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String args[]){
        System.out.println("Enter Size of an array:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("Enter values for array:");
        int[] primeArray = new int[n];
        for(int a = 0; a < primeArray.length; a++){
            primeArray[a] = in.nextInt();
        }
        System.out.println("Prime Numbers: " + primeNumber(primeArray));
    }

    public static String primeNumber(int[] source){
        int k = 1;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < source.length; i++){
            if(source[i] > 1){
                if(source[i]%k != 0){
                   sb.append(source[i]);
                   sb.append(",");
                }
            }
            k++;
        }
        return sb.toString();
    }
}
