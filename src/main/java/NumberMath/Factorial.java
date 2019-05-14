package NumberMath;

public class Factorial {
    public static void main(String args[]){
        int temp = 1;
        for(int i = 1; i <= 5; i++){
            temp = temp * i;
        }
        System.out.println(temp);
        System.out.println(recursionFactorial(5));
    }

    //Using recursion

    //how recursion works ('!' denotes factorial)
    //1! = 1 * 0! = 1
    //2! = 2 * 1 = 2 * 1!
    //3! = 3 * 2 * 1 = 3 * 2! (two factorial is nothing but 2 *1)
    //4! = 4 * 3 * 2 * 1 = 4 * 3!

    //n! = n * (n-1)!

    public static int recursionFactorial(int n){
        if( n == 0){
            return 1;
        }else{
            return n * recursionFactorial(n -1);
        }
    }
}
