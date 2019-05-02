package InterviewQuestions;

/*Rotate an array of n elements to the right by k steps.
For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].

Can we do this in O(1) space and in O(n) time? The following solution does.
        Assuming we are given 1,2,3,4,5,6 and order 2. The basic idea is:
        1. Divide the array two parts: 1,2,3,4 and 5, 6
        2. Reverse first part: 4,3,2,1,5,6
        3. Reverse second part: 4,3,2,1,6,5
        4. Reverse the whole array: 5,6,1,2,3,4*/


public class RotateArrayInJava_Reversal {
    public static void main(String args[]){
        int[] nums = new int[] {1,2,3,4,5};
        int k = 3;
        bubbleRotate(nums, k);
    }

    public static void bubbleRotate(int[] nums, int k){
        if(nums.length == 0 || nums == null || k < 0){
            throw new IllegalArgumentException("Illegal argument!!");
        }

        if( k > nums.length){
            k = k % nums.length;
        }

        int a = nums.length - k;

        reverse(nums, 0, a - 1);
        reverse(nums, a, nums.length - 1);
        reverse(nums, 0, nums.length - 1);

    }

    public static void reverse(int[] nums, int left, int right){
        if(nums == null || nums.length == 1){
            return;
        }

        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right++;
        }
    }

}
