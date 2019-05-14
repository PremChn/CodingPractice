package InterviewQuestions;

/*
    Give a number n, for each integer i in the range from 1 to n inclusive, print one value per line as follows:

    * If i is a multiple of both 3 and 5, print FizzBuzz.
    * If i is a multiple of 3 (but not 5), print Fizz.
    * If i is multiple of 5 (but not 3), pint Buzz.
    * If i is not a multiple of 3 or 5, print the value of i.

    Function description
    Complete the function fizzBuzz in the editor below. The function must print the appropriate response for each value i e(1, 2 ... n) in a ascending order, each on separate line.
    There is no return value expected.

    fizzBuzz has the following parameter(s):

    n: upper limit of values to test (inclusive)

    Constraints

    * 0 < n < 2 x 10 to the power 5

    * Sample input: 15
    *
    * Sample output:
    * 1
    * 2
    * Fizz
    * 4
    * Buzz
    * Fizz
    * 7
    * 8
    * Fizz
    * Buzz
    * 11
    * Fizz
    * 13
    * 14
    * FizzBuzz
 */

public class FizzBuzz {
    public static void main(String args[]){
        int n = 15;
        for(int i = 1; i <= n; i++){
            if(i%3 == 0 && i%5 ==0){
                System.out.println("FizzBuzz");
            }else if(i%3 == 0 && i%5 != 0){
                System.out.println("Fizz");
            }else if(i%3 !=0 && i%5 ==0){
                System.out.println("Buzz");
            }else if(i%3 !=0 && i%5 != 0){
                System.out.println(i);
            }
        }
    }
}
