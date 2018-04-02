class Solution {
    public int lengthOfLastWord(String s) {
        String[] terms = s.split(" ");
        if (terms.length==0) return 0;
        return terms[terms.length-1].length();
    }
}