//best solution
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int sArray[] = new int[26];
        int tArray[] = new int[26];
        
        for(int i=0;i<s.length();i++){
            sArray[s.charAt(i)-'a']++;
            tArray[t.charAt(i)-'a']++;
        }
        for(int i=0; i<26;i++){
            if(sArray[i]!=tArray[i])
                return false;
        }
        return true;
    }
}
//my solution
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        
        Map<Character,Integer> freq = new HashMap<Character, Integer>();
        for(int i=0;i<s.length();i++){
            freq.put(s.charAt(i), freq.getOrDefault(s.charAt(i), 0)+1);
        }
        for(int i=0;i<t.length();i++){
            if(!freq.containsKey(t.charAt(i))){
                return false;
            }
            freq.put(t.charAt(i), freq.get(t.charAt(i))-1);
        }
        for(int value: freq.values()){
            if(value!=0)
                return false;
        }
        return true;
    }
}
