class Solution {
    public int firstStableIndex(int[] nums, int k) {
        
        int[] min = new int[nums.length];
        min[min.length-1]=nums[nums.length-1];

        for(int i=nums.length-2;i>-1;i--)
        {
            min[i]=Math.min(min[i+1],nums[i]);
        }
      
        int answer = -1;

        int mini=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            mini=Math.max(nums[i],mini);

            int temp = min[i];
            if(answer!=-1) continue;
            if(mini-temp<=k) answer=i;
        }
        return answer;
    }
}