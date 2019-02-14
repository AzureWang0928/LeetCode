class Solution {
    int[] nums;
    public Solution(int[] nums) {
        this.nums = nums;
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return nums;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int[] rand = new int[nums.length];
        List<Integer> shuffleList = shuffle(nums.length);
        for(int i = 0; i < nums.length; i++){
            rand[i] = nums[shuffleList.get(i)];
        }
        return rand;
    }
    
    private List<Integer> shuffle(int num){
        List<Integer> shuffleList = new ArrayList();
        for(int i = 0; i < num; i++){
            shuffleList.add(i);
        }
        Collections.shuffle(shuffleList);
        return shuffleList;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */
