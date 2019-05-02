package NumberMath;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        if(n <= 0){
            System.out.println(n + "is invalid. Please enter some positive value");
        }else if( n == 1){
            System.out.println("Fibonacci series for the given value '" + n +"' is 1");
        }else {
            fibonacciSeries(n);
        }
    }

    public static void fibonacciSeries(int number){
        int first = 0;
        int second = 1;
        int third;
        System.out.println("Fibonacci series for the given value '" + number + "'");
        System.out.println(0);
        System.out.println(1);
       for(int i = 2; i < number; i++){
            third = first + second;
            first = second;
            second = third;
            System.out.println(third);
        }
    }
}
