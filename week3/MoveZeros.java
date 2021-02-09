/*
 * Week 3
 * Author: @ballm06m06
 * Qusetion: Move Zeros
 * Description: Given an array nums, write a function to move all 0's to the end of it 
                while maintaining the relative order of the non-zero elements..
*/

/*
 *   Soltion:
 *   The way we figured out this problem is Move all non-zero elements at front side,
 *   then put zero at the rear.
 */
class MoveZeros{
    public void moveZeroes(int[] nums) {
        if(nums == null || nums.length == 0) return;

        int postion = 0;

        for(int i = 0; i< nums.length; i++){
            // If the element in array isn't zero
            // Move it to the front
            if(nums[i] != 0){
                nums[postion++] = nums[i];
            }
        }

        while(postion < nums.length){
            nums[postion++] = 0;
        }
    }
}