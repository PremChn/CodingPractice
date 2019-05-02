package Cracking;

/*Reverse digits of an integer. Example1: x = 123, return 321 Example2: x = -123, return -321*/

public class ReverseInteger {
    public static void main(String args[]){
        int x = -123;
        System.out.println(reverse(x));
    }

    public static int reverse(int x){
        boolean flag = false;
        int res = 0;

        //to make the integer positive if the input is a negative number. This will help in calculation.
        if(x < 0){
            x = 0 - x;
            flag = true;
        }

        while (x > 0){
            int mod = x % 10;
            x = x / 10;
            res = res * 10 + mod;
        }

        //To make the integer negative again
        if (flag){
            res = 0 - res;
        }
        return res;
    }
}
