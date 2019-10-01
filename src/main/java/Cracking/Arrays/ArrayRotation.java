package Cracking.Arrays;

/*Problem: Rotate an array of n elements to the right by k steps. For example, with n
= 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].*/

public class ArrayRotation {
    public static void main(String args[]){
        int[] nums = {1,2,3,18,19};
        int k = 7;
        //Solution 1 - Intermediate Array
        rotate(nums, k);

        //Solution 2 - Bubble Rotate
       //bubbleRotate(nums, k);
    }

    //Solution 1 - Intermediate Array
    public static void rotate(int[] nums, int k){
        if(k > nums.length){
            k = k % nums.length;
        }

        int[] result = new int[nums.length];
        for(int i = 0; i < k; i++){
            result[i] = nums[nums.length - k + i];
        }

        int j = 0;
        for(int i = k; i < nums.length; i++){
            result[i] = nums[j];
            j++;
        }
        System.arraycopy(result, 0, nums, 0, nums.length);
        System.out.println(java.util.Arrays.toString(result));
    }

    public static void bubbleRotate(int[] nums, int k){
        int temp;
        if(nums == null || k < 0){
            throw new IllegalArgumentException();
        }

        for(int i = 0; i < k; i++){
            for(int j = nums.length - 1; j > 0; j--){
                temp = nums[j];
                nums[j] = nums[j - 1];
                nums[j - 1] = temp;
            }
        }
        System.out.println(java.util.Arrays.toString(nums));
    }

}
