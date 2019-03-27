class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> level = new ArrayList<Integer>();
        Arrays.sort(candidates);
        dfs(res, level, candidates, target, 0);
        return res;
    }
    
    
    public void dfs(List<List<Integer>> res, List<Integer> level, int[] candidates, int target, int startIndex){
        if(target < 0){
            return;
        }
        else if(target == 0){
            res.add(new ArrayList<Integer>(level));
        }
        else{
            for(int i = startIndex; i < candidates.length; i++){
                level.add(candidates[i]);
                dfs(res, level, candidates, target - candidates[i], i);
                level.remove(level.size() - 1);
            }
        }
    }
}
