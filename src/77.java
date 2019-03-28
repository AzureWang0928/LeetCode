class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> level = new ArrayList<Integer>();
        backtracking(res, level, n, k, 0);
        return res;
    }
    
    public void backtracking(List<List<Integer>> res, List<Integer> level, int n, int k, int startIndex){
        if(k == 0){
            res.add(new ArrayList<Integer>(level));
            return;
        }
        else{
            for(int i = startIndex; i < n - k + 1; i++){
                level.add(i + 1);
                backtracking(res, level, n, k - 1, i + 1);
                level.remove(level.size() - 1);
            }
        }
    }
}
