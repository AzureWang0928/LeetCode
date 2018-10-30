class Solution {
    public int numJewelsInStones(String J, String S) {
        int[] jArray = new int[256];
        int ans = 0;
        for(int i = 0; i < J.length(); i++){
            jArray[J.charAt(i)]++;
        }
        for(int i = 0; i < S.length(); i++){
            if(jArray[S.charAt(i)]>0){
                ans++;
            }
        }        
        return ans;
    }
}
