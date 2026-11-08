class Solution {
    public int arraySign(int[] nums) {
       int pos = 0;
       int neg = 0;

       for(int n:nums){
            if(n==0){
                return 0;
            }
            else if(n<0) neg+=1;
            else pos+=1;
       }
       if(neg%2==0) return 1;
       return -1;
    }
}