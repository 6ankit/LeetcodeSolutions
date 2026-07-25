class Solution {
    public int maxProduct(int n) {
        
        int firstMaxi = Integer.MIN_VALUE;
        int secondMaxi=Integer.MIN_VALUE;

        while(n>0){
            int rem = n%10;
            if(rem>firstMaxi){
                secondMaxi=firstMaxi;
                firstMaxi=rem;
            }else if(rem>secondMaxi){
                secondMaxi=rem;
            }
            n/=10;
        }
        return firstMaxi*secondMaxi;
    }
}