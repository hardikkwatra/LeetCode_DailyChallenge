class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int maxprofit = 0;

        for (int i = 0; i < prices.length; i++) {
            if(min > prices[i]){
                min = prices[i];
            }
            int profit = prices[i] - min;
            if(profit > maxprofit){
                maxprofit = profit;
            }

        }
        
        return maxprofit;

        
    }
}