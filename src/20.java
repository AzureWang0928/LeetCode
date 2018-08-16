class Solution {
    public boolean isValid(String s) {
        Stack<Character> vp = new Stack<Character>();
        for(char c: s.toCharArray()){
            switch (c){
                case '(':
                    vp.push(')');
                    break;
                case '[': 
                    vp.push(']');
                    break;
                case '{':
                    vp.push('}');
                    break;
                case ')':
                case ']':
                case '}':
                    if(vp.isEmpty()||vp.pop()!=c) return false;
                    break;
                default:
                    break;
            }
        }
        return vp.isEmpty();
    }
}