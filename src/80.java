class Solution {
    public int removeDuplicates(int[] nums) {
        int scan = 1;
        int save = 1;
        int count = 0;
        while(scan < nums.length){
            if(nums[scan] == nums[scan - 1]){
                count++;
                if(count < 2){
                    nums[save] = nums[scan];
                    scan++;
                    save++;
                }
                else{
                    scan++;
                }
            }
            else{
                count = 0;
                nums[save] = nums[scan];
                scan++;
                save++;
            }
        }
        return save;
    }
}
