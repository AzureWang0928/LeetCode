class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int len = prices.length;
        if (len<=1) return 0;
        int min_price = prices[0];
        for (int i=1;i<len;i++){
            max = prices[i]-min_price>max?prices[i]-min_price:max;
            if (prices[i]<min_price) min_price = prices[i];
        }
        return max;
    }
}
