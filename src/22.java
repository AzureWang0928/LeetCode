class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<String>();
        String s = new String("");
        int left = 0;
        int right = 0;
        backtracking(ans, n, s, left, right);
        return ans;
    }
    
    public void backtracking(List<String> ans, int n, String s, int left, int right){
        if(s.length() == n * 2){
            ans.add(new String(s));
            return;
        }
        if(left < n){
           backtracking(ans, n, s+"(", left + 1, right);
        } 
        if(right < left){
            backtracking(ans, n, s+")", left, right + 1);
        }
    }
}
