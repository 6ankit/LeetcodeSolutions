class Solution {
    public int longestOnes(int[] nums, int k) {
        int countOne=0;
        int countZero=0;
        int i=0;
        int j=0;
        int ans = Integer.MIN_VALUE;
        while(i<nums.length){
            if(nums[i]==1)countOne+=1;
            else countZero+=1;

            if(countZero>k){
                ans=Math.max(ans,countOne+countZero-1);
                while(j<nums.length && countZero>k){
                    if(nums[j]==0) countZero-=1;
                    else countOne-=1;
                    j+=1;
                }
            }
            i+=1;
        }
        ans=Math.max(ans,countOne+countZero);
        return ans;
    }
}