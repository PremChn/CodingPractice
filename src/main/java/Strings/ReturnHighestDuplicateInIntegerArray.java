package Strings;

import java.util.HashMap;

public class ReturnHighestDuplicateInIntegerArray {
    public static void main(String args[]){
        int arr[] = new int[] {1,2,2,4,4,4};
        maxDuplicate(arr);
    }

    public static void maxDuplicate(int[] arr){
        HashMap<Integer, Integer> map = new java.util.HashMap<Integer, Integer>();
        for(int temp : arr){
            if(map.get(temp) == null){
                map.put(temp, 1);
            }else{
                map.put(temp, map.get(temp) + 1);
            }
        }
        /*for(int a : map.keySet()){
            System.out.println(a + " " + map.get(a));
        }*/

        int count = 0;
        int temp=0;
        for(int a : map.keySet()){
            if(map.get(a) > 1){
                count = map.get(a);
                temp = a;
            }
        }
        System.out.println(temp);

    }

}
