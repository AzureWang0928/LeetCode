class Solution {
    public int countSubstrings(String s) {
        int count =1;
        if(s.length()==0) 
            return 0;
        for(int i=0; i<s.length()-1; i++){
            count = checkPalindrome(s,i,i, count);     //To check the palindrome of odd length palindromic sub-string
            count = checkPalindrome(s,i,i+1, count);   //To check the palindrome of even length palindromic sub-string
        }
        return count;
    }    

    private int checkPalindrome(String s, int i, int j, int count) {
        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j)){    //Check for the palindrome string 
            count++;    //Increment the count if palindromin substring found
            i--;    //To trace string in left direction
            j++;    //To trace string in right direction
        }
        return count;
    }
}
