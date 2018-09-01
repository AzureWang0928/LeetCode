
//O(n) time O(n) space
//Key points:sum-k用来表示和与k的差值应该减掉之前算出来的某几位之和 

class Solution {
    public int subarraySum(int[] nums, int k) {
        int result = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(map.containsKey(sum-k)) result+=map.get(sum-k);
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        return result;
    }
}