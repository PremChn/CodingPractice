package Strings;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class CountDuplicateWordsInString {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        in.close();
        countDuplicateWord(s);
    }

    public static void countDuplicateWord(String source){
        String[] sourceArray = source.split(" ");
        HashMap<String, Integer> sourceMap = new HashMap<String, Integer>();
        for(String s : sourceArray){
            if(sourceMap.containsKey(s)){
                sourceMap.put(s, sourceMap.get(s) + 1);
            }else{
                sourceMap.put(s, 1);
            }
        }

       for(String Key : sourceMap.keySet()){
           if(sourceMap.get(Key) > 1){
               System.out.println("Word '" + Key + "' ---> No. of occurance: " + sourceMap.get(Key));
           }
       }

    }
}