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
    public static int recursionFactorial(int n){
        if( n == 1){
            return 1;
        }else{
            return n * recursionFactorial(n -1);
        }
    }
}
