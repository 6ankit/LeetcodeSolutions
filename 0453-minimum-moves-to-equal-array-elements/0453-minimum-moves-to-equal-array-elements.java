class Solution {
    public int minMoves(int[] nums) {
        int ans = 0;
        int maxi = Integer.MIN_VALUE;
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            maxi=Math.max(maxi,nums[i]);
            mini=Math.min(mini,nums[i]);
        }
       
        // ans = 2
        int ans2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=mini){
                int k=nums[i]-mini;
                ans2+=k;
            }
        }
        return ans2;
    }
}