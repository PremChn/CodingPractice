package Cracking;

/*Implement a method to perform basic string compression using the counts of repeated characters
  For example, the string aabcccccaaa would become a2b1c5a3. If the "compressed" string would not
  become smaller than the original, then your method should return the original string.
 */

public class StringCompressionUsingStringBuffer {
    public static void main(String args[]){
        String str = "aabccccc";
        StringBuffer sb = new StringBuffer();
        int count = 1;
        Character last = str.charAt(0);
        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i) == last){
                count++;
            }else{
                sb.append(last);
                sb.append(count);
                last = str.charAt(i);
                count = 1;
            }
        }
        String compressedString = sb.toString();
        if(compressedString.length() > str.length()){
            System.out.println(str);
        }else{
            System.out.println(sb.toString());
        }
    }
}
