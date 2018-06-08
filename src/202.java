class Solution {
    public boolean isHappy(int n) {
        if (n==1) return true;
        HashSet<Integer> set = new HashSet<Integer>();
        while(!set.contains(n)){
            set.add(n);
            int temp=0;
            while(n!=0){
                int r=n%10;
                temp+=Math.pow(r,2);
                n=n/10;
            }
            n=temp;
            if(n==1) return true;
        }
        return false;
    }
}