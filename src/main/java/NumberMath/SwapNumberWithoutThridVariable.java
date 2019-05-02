package NumberMath;

public class SwapNumberWithoutThridVariable {
    public static void main(String args[]){
        int a = 10;
        int b = 5;
        System.out.println("'a' and 'b' values before swap:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println();
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("'a' and 'b' values after swap:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
