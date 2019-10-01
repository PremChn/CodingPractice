package Cracking;

/* Implement an algorithm to determine if a string has all unique characters.
What if you cannot use additional data structures?*/

public class StringHasUniqueCharacters {
    public static void main(String args[]){
        String s = "Prrem";
        System.out.println(isUniqueCharacter(s));
    }

    public static boolean isUniqueCharacter(String str){
        if(str.length() > 256) return false;

        boolean[] char_set = new boolean[256];
        for(int i = 0; i < str.length(); i++){
            int val = str.charAt(i);
            Character c = str.charAt(i);
            if(char_set[val]){
                return false;
            }
            char_set[val] = true;
        }
        return true;
    }

}