class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new LinkedList();
        dfs(res, new ArrayList<Integer>(), nums, 0);
        return res;
    }
    
    public void dfs(List<List<Integer>> res, List<Integer> tempList, int[] nums, int startIndex){
        res.add(new ArrayList<Integer>(tempList));
        for(int i = startIndex; i < nums.length; i++){
            tempList.add(nums[i]);
            dfs(res, tempList, nums, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }
}
