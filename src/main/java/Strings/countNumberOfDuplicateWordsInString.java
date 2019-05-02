package Strings;

import java.util.HashMap;
import java.util.Map;

public class countNumberOfDuplicateWordsInString {
    public static void main(String args[]){
        String str = "This is my book. My book is amazing. I love my book.";
        duplicateWord(str);
    }

    public static void duplicateWord(String str){
        str = str.replace(".","");
        String[] strArrat = str.split(" ");

        HashMap<String, Integer> duplicateMap = new HashMap<String, Integer>();

        for(String s : strArrat){
            if(duplicateMap.containsKey(s)){
                duplicateMap.put(s, duplicateMap.get(s) + 1);
            }else{
                duplicateMap.put(s, 1);
            }
        }

        for (HashMap.Entry<String, Integer> entry : duplicateMap.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            System.out.println(key + " = " + value);
        }
    }
}
