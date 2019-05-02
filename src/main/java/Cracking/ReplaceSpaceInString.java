package Cracking;

/* Write a method to replace all spaces in a string with '%20'. You may assume that the
string has sufficient space at the end of the string to hold the additional characters,
and that you are given the "true" length of the string. (Note: if implementing in Java,
please use a character array so that you can perform this operation in place.) */

import java.util.Arrays;

public class ReplaceSpaceInString {
    public static void main(String args[]){
        String str = "Prem Anand Panneer Selvam";
        String strArray[] = str.split(" ");
        for(int i = 0; i < strArray.length; i++){
            if(i == strArray.length - 1){
                strArray[i] = strArray[i];
            }else{
                strArray[i] = strArray[i] + "%20";
            }
        }
        StringBuilder strBuf = new StringBuilder();
        for(String s : strArray){
            strBuf = strBuf.append(s);
        }
        System.out.println(strBuf);
    }
}
