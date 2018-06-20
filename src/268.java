//bit manipulation is also aviliable
class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        int l=nums.length;
        for(int i=0;i<l;i++) sum +=nums[i];
        return l*(l+1)/2-sum;
    }
}