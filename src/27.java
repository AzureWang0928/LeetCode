class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums.length==0) return 0;
        int len = nums.length;
        int begin = 0;
        for (int i=0;i<len;i++){
            if (nums[i]!=val) {
                nums[begin]=nums[i];
                begin++;
            }
        }
        return begin;
    }
}