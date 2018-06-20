class Solution {
    public int hammingDistance(int x, int y) {
        int ans = x ^ y;
        int sum=0;
        while(ans!=0){
            sum+=ans&1;
            ans=ans>>1;
        }
        return sum;
    }
}