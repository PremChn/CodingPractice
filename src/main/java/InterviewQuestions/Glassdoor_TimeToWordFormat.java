package InterviewQuestions;

import java.util.Date;
import java.util.Scanner;

public class Glassdoor_TimeToWordFormat {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter hours:");
        int hour = in.nextInt();
        System.out.println("Enter minutes:");
        int min = in.nextInt();
        if(hour > 12 || min > 59){
            System.out.println("Invalid input for hour or minute. Hour should be between 1 to 12 and Minute should be between 1 to 59");
        }
        System.out.println(printWords(hour, min));
    }

    public static String printWords(int h, int m){
        String output = null;
        String[] wordArray = { "zero", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine",
                "ten", "eleven", "twelve", "thirteen",
                "fourteen", "fifteen", "sixteen", "seventeen",
                "eighteen", "nineteen", "twenty", "twenty one",
                "twenty two", "twenty three", "twenty four",
                "twenty five", "twenty six", "twenty seven",
                "twenty eight", "twenty nine",
        };

        if(m == 0){
            output = wordArray[h] + " O' clock";
        }else if(m == 1){
            output = " one minute past " + wordArray[h];
        }else if(m == 15){
            output = " quarter past " + wordArray[h];
        }else if(m == 30){
            output = " half past " + wordArray[h];
        }else if(m == 45){
            output = " quarter to " + wordArray[(h%12) + 1];
        }else if(m <= 30){
            output = wordArray[m] + " minutes past " + wordArray[h];
        }else if(m > 30){
            output = wordArray[60 - m] + " minutes to " + wordArray[(h%12) + 1];
        }
        return output;
    }


}
