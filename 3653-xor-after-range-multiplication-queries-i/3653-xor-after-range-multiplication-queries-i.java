class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
      for(int i=0;i<queries.length;i++){
        int idx=queries[i][0];
        while(idx<=queries[i][1]){
            nums[idx] = (int)((long)nums[idx] * queries[i][3] % 1000000007);
            idx+=queries[i][2];
        }
      }  
      if(nums.length==1) return nums[0];
      int ans =nums[0];
      for(int i=1;i<nums.length;i++){
        ans^=nums[i];
      }
    return ans;
    }
}