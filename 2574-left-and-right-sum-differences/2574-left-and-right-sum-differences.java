class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] rightSum = new int[n];
        int[] leftSum = new int[n];
        
        //10-4-8-3
        int j=1;
       
        for(int i=n-2;i>-1;i--)
        {
            rightSum[i]=rightSum[i+1]+nums[i+1];
            leftSum[j]=leftSum[j-1]+nums[j-1];
            j+=1;
        }
        
        int[] ans= new int[n];
        
        for(int i=0;i<n;i++)
        {
            ans[i]=Math.abs(leftSum[i]-rightSum[i]);
        }
        return ans;
    }
}