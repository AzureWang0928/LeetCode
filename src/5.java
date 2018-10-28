class Solution {
    int low, max = 0;
    public String longestPalindrome(String s) {
        if(s == null || s.length() < 2){
            return s;
        }
        for(int i = 0; i < s.length(); i++){
            extendPalindrome(s, i, i);
            extendPalindrome(s, i, i+1);
        }
        return s.substring(low, low+max);
    }
    
    private void extendPalindrome(String s, int midleft, int midright){
        while(midleft >= 0 && midright < s.length() && s.charAt(midleft) == s.charAt(midright)){
            midleft--;
            midright++;
        }
        midleft++;
        midright--;
        if(max < midright - midleft + 1){
            low = midleft;
            max = midright - midleft + 1;
        }
    }
}
