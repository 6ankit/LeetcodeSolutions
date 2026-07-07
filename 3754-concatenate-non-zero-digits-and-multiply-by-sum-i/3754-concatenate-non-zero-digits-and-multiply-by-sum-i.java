class Solution {
    public long sumAndMultiply(int n) {
        if(n==0) return 0;
        int x=0;
        int sum = 0;
        int mul = 1;
        while(n>0){
            int rem = n%10;
            if(rem!=0){
                sum+=rem;
                rem*=mul;
                rem+=x;
                x=rem;
                mul*=10;
            }
            n/=10;
        }
        return (long) x*sum;
    }
}