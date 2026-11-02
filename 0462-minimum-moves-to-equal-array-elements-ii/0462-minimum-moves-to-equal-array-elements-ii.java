class Solution {
    public int minMoves2(int[] nums) {
        
        Arrays.sort(nums);
        int mid = 0;
        if(nums.length%2!=0){
            mid = nums[nums.length/2];
        }else{
            mid = nums[nums.length/2-1];
        }
        int ans= 0;


        for(int i=0;i<nums.length;i++){
            if(mid>nums[i]){
                ans+=mid-nums[i];
            }else{
                ans+=nums[i]-mid;
            }
        }
        return ans;
    }
}