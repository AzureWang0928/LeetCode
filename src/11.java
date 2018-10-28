class Solution {
    public int maxArea(int[] height) {
        int ans = 0;
        int lo = 0;
        int hi = height.length - 1;
        while(lo < hi){
            ans = Math.max(ans, Math.min(height[lo], height[hi]) * (hi - lo));
            if(height[lo] < height[hi]){
                lo++;
            }
            else{
                hi--;
            }
        }
        return ans;
    }
}
