class Solution {
    public boolean isGood(int[] nums) {
        int maxi=Integer.MIN_VALUE;
        Map<Integer,Integer> mp = new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            maxi=Math.max(maxi,nums[i]);
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
            if(mp.get(nums[i])>1)
            {
                if(nums[i]!=maxi) return false;
            }
        }

        for(int i=1;i<=maxi;i++)
        {
            if(!mp.containsKey(i)) return false;
        }
        return mp.get(maxi)==2;
    }
}