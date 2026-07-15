/*
* author Ankit Lekharajani 6ankit
*  @Param An integer value
*  @Return An integer value
*/
class Solution {
    public int gcdOfOddEvenSums(int n) {
        
        int oddSum = 0;
        int evenSum = 0;

        int k=n;
        int i=1;
        while(k>0){
            oddSum+=i;
            i+=2;
            k-=1;
        }
        k=n;
        i=2;
        while(k>0){
            evenSum+=i;
            i+=2;
            k-=1;
        }
        int maxi = Integer.MIN_VALUE;

        i=1;
        while(i<Math.max(oddSum,evenSum)){
            if(oddSum%i==0 && evenSum%i==0){
                maxi=Math.max(maxi,i);
            }
            i+=1;
        }

        return maxi;
    }
}