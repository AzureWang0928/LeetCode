class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] array = new int[26];
        // Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i=0; i<magazine.length(); i++){
            // map.put(magazine.charAt(i), map.getOrDefault(magazine.charAt(i), 0) + 1);
            array[(int)(magazine.charAt(i)-'a')]++;
        }
        for(int i=0; i<ransomNote.length(); i++){
            // if(!(map.keySet().contains(ransomNote.charAt(i)))){
            //     return false;
            // }
            // if(!(map.get(ransomNote.charAt(i))>0)){
            //     return false;
            // }
            // map.put(ransomNote.charAt(i), map.get(ransomNote.charAt(i)) - 1);
            int freq = array[(int)(ransomNote.charAt(i)-'a')];
            if(!(freq > 0)){
                return false;
            }
            array[(int)(ransomNote.charAt(i)-'a')] = freq - 1;
        }
        return true;
    }
}
