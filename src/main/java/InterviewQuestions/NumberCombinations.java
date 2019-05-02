package InterviewQuestions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*Finding permutation of given number. for e.g., the number 1213 can be rewritten in 12 different combinations.*/

public class NumberCombinations {
    public static void main(String[] args) {
        // converting Integer to an array of digit
        int N = 1213;
        String numStr = Integer.toString(N);
        char[] numCharArr = numStr.toCharArray();
        int[] numArr = new int[numStr.length()];
        for (int i = 0; i < numArr.length; i++) {
            //numArr[i] = numCharArr[i] - '0'; //different way to convert a character, subtract the ASCII value of
            // zero to get the integer
            //numArr[i] = Integer.parseInt(String.valueOf(numCharArr[i])); //different way to convert a character to
            // integer.
            numArr[i] = Character.getNumericValue(numCharArr[i]);
        }

        Set<List<Integer>> setOfPermutations = new HashSet<List<Integer>>();
        setOfPermutations.add(new ArrayList<Integer>());


        for (int j = 0; j < numArr.length; j++) {


            List<List<Integer>> current = new ArrayList<List<Integer>>();
            for (List<Integer> permutation : setOfPermutations) {

                for (int k = 0; k < permutation.size() + 1; k++) {
                    ArrayList<Integer> clonePermutation = (ArrayList<Integer>) ((ArrayList<Integer>) permutation)
                            .clone();
                    clonePermutation.add(k, numArr[k]);
                    current.add(new ArrayList<Integer>(clonePermutation));
                }
            }
            setOfPermutations = new HashSet<List<Integer>>(current);
        }
        System.out.println(setOfPermutations.size());
    }
}