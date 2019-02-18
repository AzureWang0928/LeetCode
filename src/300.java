class Solution {
    public int lengthOfLIS(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int result = 1;
        int[] dp = new int[nums.length];
        
        dp[0] = 1;
        for(int i = 1; i < nums.length; i++){
            int curMaxLength = 0;
            for(int j = 0; j < i; j++){
                if(nums[i] > nums[j]){
                    curMaxLength = Math.max(curMaxLength, dp[j]);
                }
            }
            dp[i] = curMaxLength + 1;
            result = Math.max(result, dp[i]);
        }
        return result;
    }
}
