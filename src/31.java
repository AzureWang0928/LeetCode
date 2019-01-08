class Solution {
    public void nextPermutation(int[] nums) {
        int cIndex = -1;
        for(int i = nums.length - 1; i > 0; i--){
            if(nums[i] <= nums[i - 1]){
                continue;
            }  
            else{
                cIndex = i - 1;
                int k = 1;
                while(cIndex + k < nums.length && nums[cIndex] < nums[cIndex + k]){
                    k++;
                }
                
                int term  = nums[cIndex];
                nums[cIndex] = nums[cIndex + k - 1];
                nums[cIndex + k - 1] = term;
                break;
            }
        }
        // System.out.println(cIndex);
        for(int i = cIndex + 1; i < (cIndex + 1 + nums.length) / 2; i++){
            int temp = nums[i];
            nums[i] = nums[nums.length - i + cIndex];
            nums[nums.length - i + cIndex] = temp;
        }        
    }
}
