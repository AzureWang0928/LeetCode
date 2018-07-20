//Not the bset solution(Tree structure is the best)

class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if(nums.length < 2) return false;
        for (int i = 0; i < nums.length-1; i++){
            for(int j=i+1;j<=i+k&&j<nums.length;j++){
                if (Math.abs((long)nums[i]-nums[j])<=t)
                    return true;
            }
        }
        return false;
    }
}