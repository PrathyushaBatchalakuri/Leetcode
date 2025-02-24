class Solution {
    public int maxProfit(int[] prices) {

        int i = 0;

        int maxProfit = 0;

        for(int j = 1; i < j && j < prices.length; j++){

            int profit = prices[j] - prices[i];

            if(profit < 0){

                i = j;

            }

            if(profit >= maxProfit){

                maxProfit = profit;

            }
        }

        return maxProfit;
    }
}