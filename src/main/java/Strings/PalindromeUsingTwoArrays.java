package Strings;

import java.util.Arrays;

public class PalindromeUsingTwoArrays {
    public static void main(String args[]){
        String s = "bob";
        char[] chrArray = s.toCharArray();
        char temp[] = new char[chrArray.length];
        for(int i = 0; i < chrArray.length; i++){
            temp[i] = chrArray[(chrArray.length - 1) - i];
        }

        if(Arrays.equals(chrArray, temp)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a palindrome");
        }

    }
}
