/*
 * Week 1
 * Author: @ballm06m06
 * Qusetion: Single Number
 * Description: Given a non-empty array of integers, every element appears twice except for one. Find that single one.
*/

import java.util.HashMap;

class SingleNumber_using_hashmap{
    public int findSingleNumber(int[] nums){
        HashMap<Integer, Integer> hashTable = new HashMap<Integer, Integer>();

        //put all elements into HashMap
        for(int i : nums){
            /*
            *  getOrDefault(key, defaultValue)
            *  Description: Returns the value to which the specified key is mapped, or defaultValue if this map contains no mapping for the key.
            *  Explanation: First timee call this getOrDefault(i, 0)+1 ,cuz we don't have values, it'll return default value;
            *               Next time we call this function, its value is 1+1 = 2
            */ 
            hashTable.put(i, hashTable.getOrDefault(i, 0)+1);
        }

        for(int i : nums){
            if(hashTable.get(i) == 1){
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args){
        int[] list = {1,2,2,4,4,1,5};
        SingleNumber_using_hashmap s = new SingleNumber_using_hashmap();
        System.out.println(s.findSingleNumber(list));
    }
}