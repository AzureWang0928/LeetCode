class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String ans = null;
        if(paragraph == null){
            return ans;
        }
        String[] words = paragraph.split("\\s+|,+|;+|\\.+|\\?+|!+|'+");
        Map<String, Integer> map = new HashMap<String, Integer>();
        for(String word: words){
            if(word.length() != 0){
                map.put(word.toLowerCase(), map.getOrDefault(word.toLowerCase(), 0) + 1);
            }
        }

        Set<String> set = new HashSet<String>(Arrays.asList(banned));
        
        int max = 0;
        for(String word: map.keySet()){ 
            if(max < map.get(word) && !(set.contains(word))){
                ans = word;
                max = map.get(word);
            }
        }
        // PriorityQueue<Map.Entry<String, Integer>> pq = 
        //     new PriorityQueue<Map.Entry<String, Integer>>((o1, o2) -> o2.getValue() - o1.getValue());
        // pq.addAll(map.entrySet());
        // while(!(pq.isEmpty())){
        //     if(!(set.contains(pq.peek().getKey()))){
        //         ans = pq.poll().getKey();
        //         break;
        //     }
        //     pq.poll();
        // }
        
        return ans;
    }
}
