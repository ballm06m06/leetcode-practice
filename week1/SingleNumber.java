/*
 * Week 1
 * Author: @ballm06m06
 * Qusetion: Single Number
 * Description: Given a non-empty array of integers, every element appears twice except for one. Find that single one.
*/

import java.util.Arrays;

class SingleNumber {
    public int singleNumber(int[] nums) {          
        Arrays.sort(nums);
        int theOne = -100;
        
        for(int i = 0; i < nums.length- 1; i+=2){
            if(nums[i]!=nums[i+1]){
                theOne = nums[i];
                break;
            }    
        }

        if(theOne == -100){
            theOne = nums[nums.length - 1];
        }

        return theOne;
    }

    public static void main(String[] args){
        int[] intArray = new int[]{1,1,2,2,4};
        SingleNumber s = new SingleNumber();
        System.out.println(s.SingleNumber(intArray));
    } 
}
