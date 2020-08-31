/*
 * Week 1
 * Author: @ballm06m06
 * Qusetion: Happy Number
 * Description: A happy number is a number defined by the following process: Starting with any positive integer, 
 *              replace the number by the sum of the squares of its digits, and repeat the process until the number 
 *              equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. 
 *              Those numbers for which this process ends in 1 are happy numbers.
*/

import java.util.HashSet;

class happyNumber{
    public boolean isHappy(int n){
        HashSet<Integer> hashSet = new HashSet<Integer>();
        
        /* 
         * n != 1 means it's not a happy number
        */
        while(n != 1){ 
            /*
             *  why should we return false??? 
             *  Because we have to consider the number might loop endlessly in a cycle,
             *  So if this number is already in Hashset, it means we got a loop.
            */
            if(hashSet.contains(n)){
                return false;
            }
            
            hashSet.add(n);
            int total = 0;
            /* 
            * Break down the number into individual digit.
            */
            while(n!=0){           
                total = total + (n % 10)*(n % 10);
                n = n / 10;
            }
            n = total;
        }
        return true;
    }
}
