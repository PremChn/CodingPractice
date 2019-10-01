package InterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class firstNonRepeatingCharacterInString {
    public static void main(String args[]){
        String source = "leletcode";
        nonRepeatCharacterIndex(source);
    }

    public static void nonRepeatCharacterIndex(String s){
        char[] charArray = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(Character ch : charArray){
            if(map.containsKey(ch)){
                
            }
        }


    }
}
