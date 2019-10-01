package InterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class easyDial {
    public static void main(String args[]) {
           String phoneNo = "355-8123";
           boolean result = checkPhoneNo(phoneNo);
           if(result){
               System.out.println("The phone number '" + phoneNo + "' is easy to dial");
           }else{
               System.out.println("The phone number '" + phoneNo + "' is not easy to dial");
           }
    }

    public static boolean checkPhoneNo(String phoneNo) {
        Map<Integer, String> phoneNoCombination = new HashMap<Integer, String>();
        phoneNoCombination.put(1, "245");
        phoneNoCombination.put(2, "13456");
        phoneNoCombination.put(3, "256");
        phoneNoCombination.put(4, "12578");
        phoneNoCombination.put(5, "12346789");
        phoneNoCombination.put(6, "23589");
        phoneNoCombination.put(7, "4580");
        phoneNoCombination.put(8, "456790");
        phoneNoCombination.put(9, "5680");
        phoneNoCombination.put(0, "789");
        String tempString;
        char a, b;
        int j;
        boolean flag = true;
        if (phoneNo.contains("-")) {
            phoneNo = phoneNo.replaceAll("-", "");
        }
        for (int i = 0; i < phoneNo.length() - 1; i++) {
            //to avoid checking consecutive numbers, for e.g. if phone no. has 355
            if (phoneNo.charAt(i) == phoneNo.charAt(i + 1)) {
                i++;
            }
            //to get the combination of numbers next to given digit. For e.g. if the phone no. "355-8123", the below statment will get the number combination for 5 (i = 1)
            tempString = phoneNoCombination.get(Integer.parseInt(phoneNo.charAt(i) + ""));
            a = phoneNo.charAt(i + 1);
            for (j = 0; j < tempString.length(); j++) {
                b = tempString.charAt(j);
                if (a == b) {
                    flag = true;
                    break;
                }
            }
            if (j == tempString.length() && flag == false) {
                break;
            }
            flag = false;
        }
        return flag;
    }
}