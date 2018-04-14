class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack.length() < needle.length()) return -1;
        if (needle.length()==0) return 0;
        for (int j=0;j<haystack.length()-needle.length()+1;j++){
            if (haystack.substring(j, j+needle.length()).equals(needle)) return j;
        }
        return -1;
    }
}