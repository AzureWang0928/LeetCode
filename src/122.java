class Solution {
    public int maxProfit(int[] prices) {
        int ans = 0;
        int len = prices.length;
        if(len<2) return ans;
        if(len==2) return Math.max(0, prices[1]-prices[0]);
        for(int i=0,j=1;i<len&&j<len;){
            if(prices[i]>=prices[j]){
                i++;
                j++;
                continue;
            }
            else{
                while((j+1)<len&&prices[j+1]>prices[j]){
                    j++;
                }
                ans += prices[j]-prices[i];
                i=j;
                j=j+1;
            }
        }
        return ans;
    }
}
