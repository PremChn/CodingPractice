package Cracking;

/* Given two strings, write a method to decide if one is a permutation of the other. */

import java.util.Arrays;

public class Anagram {
    public static void main(String args[]){
        String s1 = "prem";
        String s2 = "mrep";
        System.out.println(permutation(s1, s2));

    }

    public static boolean permutation(String s1, String s2){
        if(s1.length() != s2.length()) return false;
        return sort(s1).equals(sort(s2));
    }

    public static String sort(String str){
        char[] content = str.toCharArray();
        //java.util.Arrays.sort(content);
        Arrays.sort(content);
        return new String(content);
    }
}
