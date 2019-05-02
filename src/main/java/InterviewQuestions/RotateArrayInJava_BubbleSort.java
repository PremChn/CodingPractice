package InterviewQuestions;

/*Rotate an array of n elements to the right by k steps.

For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].*/

import java.util.Arrays;

public class RotateArrayInJava_BubbleSort {
    public static void main(String args[]){
        int[] nums = new int[] {1,2,3,4,5,6,7};
        int k = 3;
        bubbleRotate(nums, k);
    }

    public static void bubbleRotate(int[] nums, int k){

        for(int i = 0; i < k; i++){
            for(int j = nums.length - 1; j > 0; j--){
                int temp = nums[j];
                nums[j] = nums[j - 1];
                nums[j - 1] = temp;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
