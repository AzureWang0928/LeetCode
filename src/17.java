class Solution {
    public List<String> letterCombinations(String digits) {
        String[] array = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> res = new ArrayList<String>();
        if(digits.length() == 0){
            return res;
        }
        backtracking(res, digits, array, "", 0);
        return res;
    }
    
    public void backtracking(List<String> res, String digits, String[] array, String temp, int startIndex){
        if(temp.length() == digits.length()){
            res.add(new String(temp));
            return;
        }
        
        String letter = array[Integer.parseInt(digits.charAt(startIndex)+"") - 2];
        for(int j = 0; j < letter.length(); j++){
            backtracking(res, digits, array, temp + letter.charAt(j), startIndex + 1);
        }
    }
}
