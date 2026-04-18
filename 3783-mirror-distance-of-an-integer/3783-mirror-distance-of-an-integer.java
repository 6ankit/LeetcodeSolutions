class Solution {
    public int mirrorDistance(int n) {
        int reverse = 1;
        int mul = 0;
        int temp = n;
        while(n>0){
            int rem = n%10;
            reverse = reverse * mul;
            reverse+=rem;
            mul=10;
            n/=10;
        }
        return Math.abs(temp-reverse);
    }
}