class Solution {
    public void sortColors(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        
        for(int i = 0; i <= right; i++){
            if(nums[i] == 0){
                int term = nums[i];
                nums[i] = nums[left];
                nums[left] = term;
                left++;
                //No i-- here, because the left must points to a 1
                //i--;
            }          
            else if(nums[i] == 2){
                int term = nums[i];
                nums[i] = nums[right];
                nums[right] = term;
                right--;
                i--;
            }
        }
    }
}
