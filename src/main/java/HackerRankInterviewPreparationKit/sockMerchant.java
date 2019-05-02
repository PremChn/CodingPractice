package HackerRankInterviewPreparationKit;

/*John works at a clothing store. He has a large pile of socks that he must pair by color for sale.
Given an array of integers representing the color of each sock, determine how many pairs of socks with
matching colors there are. For example, there are n=7 socks with colors ar=[1,2,1,2,1,3,2]. There is one pair of color  1 and
one of color 2. There are three odd socks left, one of each color. The number of pairs is 2.
*/

import java.util.Arrays;
import java.util.Scanner;

public class sockMerchant {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of socks");
        int totSocks = in.nextInt();
        int SockArray[] = new int[totSocks];
        System.out.println("Enter sock colors in the form of integers");
        for (int i = 0; i < SockArray.length; i++) {
            SockArray[i] = in.nextInt();
        }
        System.out.println(noOfPairs(SockArray));
    }

    public static int noOfPairs(int[] arr) {
        int count = 0;
        Arrays.sort(arr);
        for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] == arr[j + 1]) {
                    count = count + 1;
                    j = j + 1;
                }

        }
        return count;
    }
}