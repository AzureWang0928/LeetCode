class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++){
            if (set.contains(nums[i]))
                return true;
            set.add(nums[i]);
        }
        return false;
    }
}




//Other Solution
class Solution {
	public boolean containsDuplicate(int[] nums) {
	    if(nums.length < 2) return false;
	    int max=nums[0];
	    int min=nums[0];
	    for(int i:nums){
	        if(i>max) max=i;
	        if(i<min) min =i;
	    }
	    if (max-min+2<nums.length) return true; //My improvement
	    boolean[] boolNums = new boolean[max-min+2];
	    for(int i:nums){
	        if(boolNums[i-min]) return true;
	        else boolNums[i-min]=true;
	    }
	    return false;
	}
}