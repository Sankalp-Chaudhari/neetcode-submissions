class Solution {
    public int maxProfit(int[] prices) {
       int maxProfit=0;
       int minProfit=Integer.MAX_VALUE;
       for(int price:prices){
        if(price<minProfit){
            minProfit=price;
        }
        else{
            int profit=price-minProfit;
            maxProfit=Math.max(maxProfit,profit);
        }
       }
       return maxProfit;
    }
}
