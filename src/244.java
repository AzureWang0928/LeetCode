class WordDistance {
    private Map<String,List<Integer>> map = new HashMap();
    public WordDistance(String[] words) {
        for (int i = 0; i < words.length; i++){
            if (!map.containsKey(words[i])){
                List<Integer> indexList = new ArrayList();
                indexList.add(i);
                map.put(words[i], indexList);
            }
            else{
                map.get(words[i]).add(i);
            }
        }
    }
    
    public int shortest(String word1, String word2) {
        int ans = Integer.MAX_VALUE;
        List<Integer> list1 = map.get(word1);
        List<Integer> list2 = map.get(word2);
        for (int i = 0, j = 0; i < list1.size() && j < list2.size();){
            int pos1 = list1.get(i);
            int pos2 = list2.get(j);
            if (pos1  < pos2){
                ans = Math.min(ans, pos2 - pos1);
                i++;
            }
            else{
                ans  = Math.min(ans, pos1 - pos2);
                j++;
            }
        }
        return ans;
    }
}

/**
 * Your WordDistance object will be instantiated and called as such:
 * WordDistance obj = new WordDistance(words);
 * int param_1 = obj.shortest(word1,word2);
 */
