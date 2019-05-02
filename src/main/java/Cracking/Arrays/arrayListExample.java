package Cracking.Arrays;

import java.util.ArrayList;

public class arrayListExample {
    public static void main(String args[]){
        ArrayList<String> obj = new ArrayList<String>();
        obj.add("First");
        obj.add("Second");
        obj.add("Third");

        for(String s : obj){
            if(s.equals("Second")){
                System.out.println("Second string found");
            }
        }
    }
}
