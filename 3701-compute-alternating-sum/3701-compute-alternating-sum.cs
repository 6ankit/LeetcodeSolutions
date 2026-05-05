public class Solution {
    public int AlternatingSum(int[] nums) {
        int ans = nums[0];
        for(int i=1;i<nums.Length;i++)
        {
            if(i%2==0)
            {
                ans+=nums[i];
            }
            else
            {
                ans-=nums[i];
            }
        }
        return ans;
    }
}