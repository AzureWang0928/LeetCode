class Solution {
    public List<String> letterCasePermutation(String S) {
        if(S == null){
            return new ArrayList<String>();
        }
        List<String> res = new ArrayList<String>();
        backtracking(S.toCharArray(), res, 0);
        return res;
    }
    
    public void backtracking(char[] s, List<String> res, int startIndex){
        if(startIndex == s.length){
            res.add(new String(s));
            return;
        }
        if(Character.isDigit(s[startIndex])){
            backtracking(s, res, startIndex + 1);
        }
        else{
            s[startIndex] = Character.toUpperCase(s[startIndex]);
            backtracking(s, res, startIndex + 1);
            s[startIndex] = Character.toLowerCase(s[startIndex]);
            backtracking(s, res, startIndex + 1);
        }
    }
}
