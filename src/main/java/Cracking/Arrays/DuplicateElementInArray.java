package Cracking.Arrays;

/*
Check if a given array contains duplicate elements within k distance from each other
Example:

Input: k = 3, arr[] = {1, 2, 3, 4, 1, 2, 3, 4}
Output: false
All duplicates are more than k distance away.

Input: k = 3, arr[] = {1, 2, 3, 1, 4, 5}
Output: true
1 is repeated at distance 3.

Input: k = 3, arr[] = {1, 2, 3, 4, 5}
Output: false

Input: k = 3, arr[] = {1, 2, 3, 4, 4}
Output: true
 */

import java.util.HashSet;

public class DuplicateElementInArray {
    public static void main(String args[]){
        int arr[] = {1, 2, 3, 4, 1, 2, 3, 4};
        int index = 3;
        System.out.println(IsDuplicate(arr,index));
    }
    public static boolean IsDuplicate(int arr[],int index){
       HashSet<Integer> set = new HashSet<Integer>();
       for(int i = 0; i < arr.length; i++){
           if(set.contains(arr[i])){
               return true;
           }else{
               set.add(arr[i]);
           }
           if( i >= index){

           }
       }
        return false;
    }


}

