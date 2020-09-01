/*
 * Week 2
 * Author: @ballm06m06
 * Qusetion: Maximum Subarray
 * Description: Given an integer array nums, find the contiguous subarray (containing at least one number) 
 *              which has the largest sum and return its sum.
*/

class MaximumSubarray {
    public int maxSubArray(int[] nums) {
               
        int current_sum = nums[0];
        int best_sum = current_sum;
        
        //  test for each loop
        for(int i = 1; i<nums.length; i++){
            current_sum = Math.max(nums[i], current_sum + nums[i]);
            best_sum = Math.max(current_sum, best_sum);   
        }
        return best_sum;
    }
}