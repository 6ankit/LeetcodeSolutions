class Solution {
    public int maxAdjacentDistance(int[] nums) {
        
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){

            if(i==nums.length-1){
                ans=Math.max(ans,Math.abs(nums[i]-nums[0]));
            }else{
                ans=Math.max(ans,Math.abs(nums[i]-nums[i+1]));
            }
        }
        return ans;
    }
}