class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int maxi = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            maxi=Math.max(nums[i],maxi);
            min=Math.min(nums[i],min);
        }
        int m=maxi-min;
        return (long)m*k;
    }
}