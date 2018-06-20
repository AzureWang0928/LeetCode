class Solution {
    public int addDigits(int num) {
        while(num>=10){
            int term=0;
            do{
                term+=num%10;
                num/=10;
            }while(num!=0);
            num=term;
        }
        return num;
    }
}