package HackerRankInterviewPreparationKit;

/*You are in charge of the cake for your niece's birthday and have decided the cake will have one candle for each year of her total age.
When she blows out the candles, she’ll only be able to blow out the tallest ones. Your task is to find out how many candles she can successfully blow out.

        For example, if your niece is turning 4 years old, and the cake will have 4 candles of height 4, 4, 1, 3, she will be able to blow out 2 candles successfully,
        since the tallest candles are of height 4 and there are 2 such candles.

        Function Description

        Complete the function birthdayCakeCandles in the editor below. It must return an integer representing the number of candles she can blow out.

        birthdayCakeCandles has the following parameter(s):

        ar: an array of integers representing candle heights
        Input Format

        The first line contains a single integer, n, denoting the number of candles on the cake.
        The second line contains n space-separated integers, where each integer i describes the height of candle i.

        Output Format

        Print the number of candles that can be blown out on a new line.

        Sample Input

        4
        3 2 1 3

        Sample Output
        2

        Explanation:
        We have one candle of height 1, one candle of height 2, and two candles of height 3. Your niece only blows out the tallest candles, meaning the candles where .
        height = 3. Because there are 2 such candles, we print 2 on a new line.*/

import java.util.HashMap;
import java.util.Map;

public class BirthdayCakeCandles {
    public static void main(String args[]){

        int[] candles = {3, 2, 1, 3};
        System.out.println(solution(candles));
    }

    public static int solution(int[] candles){
        Map<Integer, Integer> temp = new HashMap<Integer, Integer>();
        for(Integer in : candles){
            if(temp.containsKey(in)){

            }
        }

        return 1;
    }
}
