Time Cmplexity: O(n/2)
Space Complexity: O(1)

class Solution {
    public String reverseString(String s) {
        int l = s.length();
        if(l<2) return s;
        int hl = l/2;
        char[] ch = s.toCharArray();
        String ans = "";
        for(int i=0;i<hl;i++){
            char temp = s.charAt(i);
            ch[i] = ch[l-i-1];
            ch[l-i-1] = temp;
        }
        return new String(ch);
    }
}