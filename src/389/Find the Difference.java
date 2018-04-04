class Solution {
    public char findTheDifference(String s, String t) {
        int result=0;
        for (int i=0;i<s.length();i++) result+= (int)t.charAt(i)-(int)s.charAt(i);
        return (char) (result+(int)t.charAt(t.length()-1));
    }
}