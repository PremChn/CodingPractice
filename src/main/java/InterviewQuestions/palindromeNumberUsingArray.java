package InterviewQuestions;

import java.util.Arrays;

public class palindromeNumberUsingArray {
    public static void main(String args[]){
        int x = -121;
        System.out.println(reverseNo(x));
    }

    public static boolean reverseNo(int x){
        String[] numString = String.valueOf(x).split("");
        String[] temp = new String[numString.length];

        for(int i = 0; i < numString.length; i++){
            temp[i] = numString[numString.length - i - 1];
        }

        if(Arrays.deepEquals(temp,numString)){
            return true;
        } else{
            return false;
        }
    }

}
