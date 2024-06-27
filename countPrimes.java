//https://leetcode.com/problems/count-primes/

class Solution {
    public int countPrimes(int n) {
        if(n<2)
            return 0;
            
        int count=0;
        boolean[] prime=new boolean[n];
        //Initially all the values in boolean array are false. So, in this case prime[i]=>false then it is prime while prime[i]=>true then it is not prime
        
        for(int i=2; i*i<n ; i++){
            if(prime[i]==false)
            {
                for(int j=i*i; j<n; j=j+i)
                {
                    prime[j]=true;
                }
            }
        }
        for(int i=2;i<n;i++)
        {
            if(prime[i]==false)
                count++;
        }
        return count;   
    }
    
}
