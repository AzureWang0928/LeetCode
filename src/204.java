//Not the bes solution
class Solution {
    ArrayList<Integer> primes = new ArrayList<Integer>();
    public int countPrimes(int n) {
        int count=0;
        for(int i=2;i<n;i++){
            if(isPrime(i)){
                count++;
                primes.add(i);
            }
        }
        return count;
    }
    private boolean isPrime(int x){
        for(int prime: primes){
            if(prime*prime>x) break;
            if(x%prime==0) return false;
        }
        return true;
    }
}