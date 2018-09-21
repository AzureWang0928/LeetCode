class Solution {
    public int firstUniqChar(String s) {
        int index = Integer.MAX_VALUE;
        int sArray[] = new int[26];
        for(int i=0;i<s.length();i++){
            sArray[s.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(sArray[i]==1){
                index = Math.min(index, s.indexOf('a'+i));
            }
        }
        return index==Integer.MAX_VALUE?-1:index;
    }
}
