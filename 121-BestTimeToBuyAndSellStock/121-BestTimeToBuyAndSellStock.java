// Last updated: 8/6/2026, 10:34:42 AM
class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int low=prices[0];
        int profit=0;
        
        for(int i=0;i<n;i++){
            int temp=prices[i]-low;
            profit=Math.max(profit,temp);
            if(prices[i]<low){
                low=prices[i];
            }

        }
        return profit;
    }
}