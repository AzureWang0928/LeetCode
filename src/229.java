class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<Integer>();
        if(nums.length == 0){
            return ans;
        }
        int check1 = nums[0];
        int check2 = nums[0];
        int count1 = 0;
        int count2 = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == check1){
                count1++;
            }
            else if(nums[i] == check2){
                count2++;
            }
            else if(count1 == 0){
                check1 = nums[i];
                count1++;
            }
            else if(count2 == 0){
                check2 = nums[i];
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for(int i = 0; i < nums.length; i++){
            if(check1 == nums[i]){
                count1++;
            }
            else if(check2 == nums[i]){
                count2++;
            }
        }
        
        if(count1 > nums.length / 3){
            ans.add(check1);
        }
        if(count2 > nums.length / 3){
            ans.add(check2);
        }
        return ans;
    }
}
