class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int primeArray[] = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101};
        List<List<String>> res = new ArrayList<List<String>>();
        Map<Integer, List<String>> map = new HashMap<Integer, List<String>>();
        
        for(String s: strs){
            int key = 1;
            char sa[] = s.toCharArray();
            for(char c: sa){
                key *= primeArray[c - 'a'];
            }
            List<String> level = map.getOrDefault(key, new ArrayList<String>());
            level.add(s);
            map.put(key, level);
        }
        
        for(Integer key: map.keySet()){
            res.add(map.get(key));
        }
        return res;
    }
}
