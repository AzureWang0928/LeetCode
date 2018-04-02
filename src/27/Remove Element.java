class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums.length==0) return 0;
        int len = nums.length;
        for (int i=0;i<len;i++){
            if (nums[i]==val) {
                while (len>0&&nums[len-1]==val){
                    len--;
                }
                if (len>0){
                    if (i<len-1)
                        nums[i]=nums[len-1];
                        len--; 
                }
            }
        }
        return len;
    }
}