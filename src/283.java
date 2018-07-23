//Key point is judge num[i]!=0 instead of nums[i]==0

class Solution {
    public void moveZeroes(int[] nums) {
        int l =nums.length;
        if (l ==0 || l==1) return;
        int count = 0;
        for (int i =0; i<l; i++){
            if (nums[i]!=0){
                nums[count++] = nums[i];
            }
        }
        for (int j = count; j < l; j++){
            nums[j] = 0;
        }
    }
}