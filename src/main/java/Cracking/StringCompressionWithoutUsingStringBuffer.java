package Cracking;

public class StringCompressionWithoutUsingStringBuffer {
    public static void main(String args[]){
        String str = "aabcccccaaa";
        int size = countCompression(str);
        if(size >= str.length()){
            System.out.println(str);
        }else {
            char[] charArray = new char[size];
            char last = str.charAt(0);
            int count = 1;
            int index = 0;
            for (int i = 1; i < str.length(); i++) {
                if (str.charAt(i) == last) {
                    count++;
                } else {
                    index = setChar(charArray, last, index, count);
                    last = str.charAt(i);
                    count = 1;
                }
            }

            index = setChar(charArray, last, index, count);
            System.out.println(String.valueOf(charArray));
        }
    }

    public static int setChar(char[] charArray, char c, int index, int count){
        charArray[index] = c;
        index++;

        char[] cnt = String.valueOf(count).toCharArray();

        for(char x : cnt){
            charArray[index] = x;
        }
        return index;
    }

    public static int countCompression(String str){
        char last = str.charAt(0);
        int count = 1;
        int size = 0;
        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i) == last){
                count++;
            }else{
                int temp = String.valueOf(count).length();
                size = size + 1 + temp;
                last = str.charAt(i);
                count = 1;
            }
        }
        size = size + 1 + String.valueOf(count).length();
        return size;
    }
}
