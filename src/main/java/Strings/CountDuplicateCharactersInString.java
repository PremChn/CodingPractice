package Strings;

import java.util.*;

public class CountDuplicateCharactersInString {
    public static void main(String args[]){
       /* Scanner in = new Scanner(System.in);
        String sourceString = in.nextLine();
        in.close();*/
        String sourceString = "anand";
        CountDuplicate(sourceString);
    }

    public static void CountDuplicate(String s){
        //To remove spaces from string
        s = s.replaceAll("\\s+"," ");
        char[] stringToChar = s.toCharArray();
        Arrays.sort(stringToChar);
        HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();
        //Map<Integer,Integer> charMap = new HashMap<Integer, Integer>();
        for(Character ch : stringToChar){
            if(charMap.containsKey(ch)){
                charMap.put(ch, charMap.get(ch) + 1);
            }else{
                charMap.put(ch, 1);
            }
        }
        Set<Character> key = charMap.keySet();
        for(Character chr : key){
            if(charMap.get(chr) > 1){
                System.out.println("Character '" + chr + "' ---> No. of occurance: " + charMap.get(chr));
            }
        }
    }
}