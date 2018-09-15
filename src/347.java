class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Integer>[] frequency = new List[nums.length+1];
        for(int key : map.keySet()){
            int f = map.get(key);
            if (frequency[f] == null) frequency[f] = new ArrayList<Integer>(); 
            frequency[f].add(key);
        }
        List<Integer> ans = new ArrayList<Integer>();
        for(int i = frequency.length-1; i>=0 && k > ans.size(); i--){
            if(frequency[i]!=null)
                ans.addAll(frequency[i]);
        }
        return ans;
    }
}
