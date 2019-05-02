package Cracking;

/*Implement a method to perform basic string compression using the counts of repeated characters
  For example, the string aabcccccaaa would become a2b1c5a3. If the "compressed" string would not
  become smaller than the original, string your method should return the original string.
 */

public class StringCompressionUsingString {
    public static void main(String args[]){
        String str = "aabcccccaaa";
        String myStr = "";
        char last = str.charAt(0);
        int count = 1;
        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i) == last){
                count++;
            }else{
                myStr = myStr + last + "" + count;
                last = str.charAt(i);
                count = 1;
            }
        }
        System.out.println(myStr + last + count);
    }
}
