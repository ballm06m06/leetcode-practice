/*
 * Week 3
 * Author: @ballm06m06
 * Qusetion: Best Time to Buy and Sell Stock II
 * Description: Say you have an array prices for which the ith element is the price of a given stock on day i.
                Design an algorithm to find the maximum profit. You may complete as many transactions as you like 
                (i.e., buy one and sell one share of the stock multiple times).
*/
/**
 *  Solution: If we got a price array like this, e.g. [1,2,3], the best answer is buy at day one and sell it on
 *            day 3. The profit equals to (3-2)+(2-1), so if price[i+1] is bigger than price[i], 
 *            we could have some profit.  
 */

class BestTimetoBuyandSellStock2{
    public int maxProfit(int[] prices) {
        int profit = 0;

        for(int i=1; i<prices.length; i++){
            //Syntax here could avoid ArrayIndexOutOfBounds exception
            if(prices[i] > prices[i-1]){
                profit = profit + (prices[i] - prices[i-1]);
            }
        }
        System.out.print(profit);
        return profit;
    }

    public static void main(String[] args){
        int[] array = {1,2,3,4};
        BestTimetoBuyandSellStock2 stock = new BestTimetoBuyandSellStock2();
        stock.maxProfit(array);
    }
}