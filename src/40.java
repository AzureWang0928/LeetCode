class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
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
            return;
        }
        else{
            for(int i = startIndex; i < candidates.length; i++){
                if(i != startIndex && candidates[i] == candidates[i - 1]){
                    continue;
                }
                level.add(candidates[i]);
                dfs(res, level, candidates, target - candidates[i], i + 1);
                level.remove(level.size() - 1);
            }
        }
    }
}
