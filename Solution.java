import java.util.HashMap;
import java.util.Arrays;

class Solution {
    public static void main(String[] args){
		int[] intArray = new int[]{1,2,2};
		Solution s = new Solution();
		s.singleNumber(intArray);
	} 
	
	
	public int singleNumber(int[] nums) {          
        Arrays.sort(nums);
        
        int theone = 0;
        
        for(int i = 0; i<nums.length/2 - 1; i++){
            if(nums[i]!=nums[i+2] && nums[i]==nums[i+1]){
                System.out.println("fuck you");
                continue;
            }else{
                System.out.println("Single number: "+nums[i]);
                theone = nums[i];
            }        
        }
         System.out.println("hi");
        return theone;
        
        // HashMap<String, String> Numbers = new HashMap<String, String>();
        // Numbers.put(nums[i])
    }

	
	
}

