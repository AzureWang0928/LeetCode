class Solution {
    private class largestNumberComparator implements Comparator<String>{
        @Override
        public int compare(String s1, String s2){
            String order1 = s1 + s2;
            String order2 = s2 + s1;
            return order2.compareTo(order1);
        }
    }
    
    
    public String largestNumber(int[] nums) {
        String[] asStr = new String[nums.length];
        for(int i=0;i<nums.length;i++){
            asStr[i] = String.valueOf(nums[i]);
        }
        
        Arrays.sort(asStr, new largestNumberComparator());
        
        if(asStr[0].equals("0")){
            return "0";
        }
        
        StringBuilder sb = new StringBuilder();
        for(String s: asStr){
            sb.append(s);
        }
        return sb.toString();
        
    }
}
