class Solution {
    public int longestSubsequence(int[] nums) {

        int xor = 0;
        int count = 0;
        for(int i=0;i<nums.length;i++){
            xor^=nums[i];
            if(nums[i]==0) count+=1;
        }
        if(count==nums.length){
            return 0;
        }
        if(xor==0){
            return nums.length-1;
        }
        return nums.length;
    }
}