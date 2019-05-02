package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class PalindromeUsingCharacterArray {
    public static void main(String args[]){
        System.out.println("Enter a string to check palindrome:");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        in.close();
        char temp;
          char[] charSource = s.toCharArray();
        for(int i = 0; i < charSource.length/2; i++){
            temp = charSource[i];
            charSource[i] = charSource[(charSource.length - 1) - i];
            charSource[(charSource.length - 1) - i] = temp;
                                }
        if(s.equals(String.valueOf(charSource))){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
        //code using reverse for loop
//        int j = 0;
//        for(int i = charSource.length - 1; i >=0; i--){
//            charSource[j] = charSource[i];
//            j++;
//        }
//        String f = String.valueOf(charSource);
//        if(f.equals(s)){
//            System.out.println("true");
//        }else{
//            System.out.println("false");
//        }
    }


}
