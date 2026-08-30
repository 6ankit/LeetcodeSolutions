class Solution {
    public int minimumDeletions(int[] nums) {
        int minElement = Integer.MAX_VALUE;
        int maxElement = Integer.MIN_VALUE;
        int minIndex = -1;
        int maxIndex = -1;


        for(int i=0;i<nums.length;i++){
            int val = nums[i];

            if(val>maxElement){
                maxElement=val;
                maxIndex=i;
            }
            if(val<minElement){
                minElement=val;
                minIndex=i;
            }
        }
       
        int right = Math.max(maxIndex,minIndex);
        int left = Math.min(minIndex,maxIndex);

        
        return Math.min(right+1,Math.min(nums.length-left,(left+1)+(nums.length-right)));
    }
}