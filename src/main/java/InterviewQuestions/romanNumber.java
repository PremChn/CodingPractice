package InterviewQuestions;

public class romanNumber {
    public static void main(String args[]){
        String s = "LVIII";
        System.out.println(romanToRegular(s));
    }

    public static int romanToRegular(String s){
        int sum=0;
        for(int i=0;i<s.length();i++){
            switch (s.charAt(i)){
                case 'I': sum+=1;
                    if(i+1<s.length()){
                        char temp = s.charAt(i+1);
                        switch(s.charAt(i+1)){
                            case 'V':sum+=3;i++;break;
                            case 'X':sum+=8;i++;break;
                        }
                    }
                    break;
                case 'V':
                    sum+=5;
                    break;
                case 'X': sum+=10;
                    if(i+1<s.length()){
                        switch(s.charAt(i+1)){
                            case 'L':sum+=30;i++;break;
                            case 'C':sum+=80;i++;break;
                        }
                    }
                    break;
                case 'L':
                    sum+=50;
                    break;
                case 'C': sum+=100;
                    if(i+1<s.length()){
                        switch(s.charAt(i+1)){
                            case 'D':sum+=300;i++;break;
                            case 'M':sum+=800;i++;break;
                        }
                    }
                    break;
                case 'D':
                    sum+=500;
                    break;
                case 'M':
                    sum+=1000;
                    break;
            }
        }
        return sum;
    }

}

/*I             1
V             5
X             10
L             50
C             100
D             500
M             1000*/