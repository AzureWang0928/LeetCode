class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        if (strs.length == 1) return strs[0];
        String ans = new String("");
        for (int j=0;j<strs[0].length();++j){
            char c = strs[0].charAt(j);
            for (int i=1;i<strs.length;++i){
                if((strs[i].length()<j+1)||(c!=strs[i].charAt(j))){
                    return ans;
                }
            }
            ans+=c;
        }
        return ans;
    }
}