class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int minProfit=Integer.MAX_VALUE;
        for(int price:prices){
            if(minProfit>price){
                minProfit=price;
            }
            else{
                int minprice=price-minProfit;
                maxProfit=Math.max(minprice,maxProfit);
            }
        }
        return maxProfit;
    }
}
