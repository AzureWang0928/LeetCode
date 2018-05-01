class Solution {
    public String addBinary(String a, String b) {
        int len_a=a.length()-1;
        int len_b=b.length()-1;
        StringBuilder out = new StringBuilder();
        int carry=0;
        while(!(len_a==-1&&len_b==-1)||carry==1){
            int val_a=len_a==-1?0:a.charAt(len_a)-'0';
            int val_b=len_b==-1?0:b.charAt(len_b)-'0';
            int cur = (val_a + val_b +carry)%2;
            carry = (val_a + val_b +carry)/2;
            out.insert(0, String.valueOf(cur));
            
            len_a = len_a==-1?-1:len_a-1;
            len_b = len_b==-1?-1:len_b-1;
        }
        return out.toString();
    }
}