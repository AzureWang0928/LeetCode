class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        Map<Integer, Integer> freq = new HashMap<Integer, Integer>();
        for(int i=0;i<nums2.length;i++){
            freq.put(nums2[i], freq.getOrDefault(nums2[i], 0)+1);
        }
        for(int i=0;i<nums1.length;i++){
            if(freq.containsKey(nums1[i]) && (freq.get(nums1[i])>0)){
                ans.add(nums1[i]);
                freq.put(nums1[i], freq.get(nums1[i])-1);
            }
        }
        int res[] = new int[ans.size()];
        if(ans.size()>0){
            for(int i=0;i<ans.size();i++){
                res[i] = ans.get(i);
            }
        }
        return res;
    }
}
