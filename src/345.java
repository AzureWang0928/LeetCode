Time Complexity: O(n)
Space Complexty: O(1)

class Solution {
    public String reverseVowels(String s) {
        int l = s.length();
        if(l<2) return s;
        int low = 0;
        int high = l-1;
        char[] ch = s.toCharArray();
        HashSet<String> set = new HashSet<String>();
        set.add("a");set.add("e");set.add("i");set.add("o");set.add("u");
        set.add("A");set.add("E");set.add("I");set.add("O");set.add("U");

        while(low<high){
            while(low<high&&!set.contains(ch[low]+""))
                low++;
            while(low<high&&!set.contains(ch[high]+""))
                high--;
            if(ch[low]!=ch[high]){
                char temp = ch[low];
                ch[low] = ch[high];
                ch[high] = temp;
            }
            low++;
            high--;
        }
        return new String(ch);
    }
}