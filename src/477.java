class Solution {
    public int totalHammingDistance(int[] nums) {
        int l = nums.length;
        int[] bitCount= new int[32];
        int sum=0;
        for(int i=0;i<l;i++){
            for(int j=0;j<32;j++){
                bitCount[j]+=nums[i]&1;
                nums[i]=nums[i]>>1;
            }
        }
        for(int c=0;c<32;c++){
            sum+=bitCount[c]*(l-bitCount[c]);
        }
        return sum;
    }
    
}