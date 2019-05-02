package InterviewQuestions;

public class palindromeNumber {
    public static void main(String args[]){
        int x = 100;
        System.out.println(isPalindrome(x));
    }
    public static boolean isPalindrome(int x){
        int ret = 0;
        int temp = x;
        if(temp < 0){
            temp = 0 - temp;
        }

        while(temp > 0){
            int mod = temp%10;
            temp = temp/10;
            ret = ret * 10 + mod;
        }
        if (ret == x){
            return true;
        }else{
            return false;
        }

    }


}
