//51.85% 无优化
class Solution {
    public int romanToInt(String s) {
        if (s.length()==0) return 0;
        int ans = 0;
        for(int i=1;i<=s.length();i++){
            char pre = s.charAt(i-1);
            char cur;
            if (i!=s.length())
                cur = s.charAt(i);
            else
                cur = 'Q';
            if (pre=='I') {
                if (cur!='V'&&cur!='X'){
                    ans++;
                    continue;
                }
                else{
                    ans--;
                    continue;
                }
            }
            else if (pre=='V') ans+=5;
            else if (pre=='X') {
                if (cur!='L'&&cur!='C'){
                    ans+=10;
                    continue;
                }
                else{
                    ans-=10;
                    continue;
                }
            }
            else if (pre=='L') ans+=50;
            else if (pre=='C') {
                if (cur!='D'&&cur!='M'){
                    ans+=100;
                    continue;
                }
                else{
                    ans-=100;
                    continue;
                }
            }
            else if (pre=='D') ans+=500;
            else ans+=1000;
        }
        return ans;
    }
}