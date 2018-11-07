public class Solution {
    public String reverseWords(String s) {
        int count = 0;
        for(count = 0; count < s.length(); count++){
            if(s.charAt(count) != ' '){
                break;
            }
        }
        s = s.substring(count, s.length());
        String[] terms = s.split("\\s+");
        System.out.println(terms.length);
        
        if(terms.length < 1){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for(int i = terms.length - 1; i >= 0; i--){
            sb.append(terms[i]);
            System.out.println(i);
            if(i != 0){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
