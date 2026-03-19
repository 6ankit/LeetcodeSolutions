class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<nums.length-1;i++){
            int count=1;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]<=nums[j-1]){
                    break;
                }
                count+=1;
            }
            ans=Math.max(ans,count);
        }
        if(ans==Integer.MIN_VALUE) return 1;
        return ans;
    }
}