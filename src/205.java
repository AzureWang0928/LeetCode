class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<Character, Character>();
        Map<Character, Character> rmap = new HashMap<Character, Character>();
        for(int i = 0; i < s.length(); i++){
            if(map.keySet().contains(s.charAt(i))){
                if(map.get(s.charAt(i)) != t.charAt(i)){
                    return false;
                }
            }
            else{
                map.put(s.charAt(i), t.charAt(i));
            }
            if(rmap.keySet().contains(t.charAt(i))){
                if(rmap.get(t.charAt(i)) != s.charAt(i)){
                    return false;
                }
            }
            else{
                rmap.put(t.charAt(i), s.charAt(i));
            }
        }
       
        return true;
    }
}
