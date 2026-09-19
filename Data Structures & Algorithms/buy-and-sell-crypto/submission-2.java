class Solution {
    public int maxProfit(int[] prices) {
       int minp = prices[0];
       int maxprofit = 0;
       for(int num: prices){
            minp = Math.min(num,minp);
            maxprofit = Math.max(maxprofit,num - minp);
       }

       return maxprofit;
    }
}
