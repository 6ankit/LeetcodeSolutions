class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int len=1;
        int maxLen=1;

        int i=1;
        while(i<nums.length){
            if(nums[i]<=nums[i-1]){
                maxLen=Math.max(len,maxLen);
                len=1;
            }
            else{
                len+=1;
            }
            i+=1;
        }
        maxLen=Math.max(len,maxLen);
        return maxLen;
    }
}