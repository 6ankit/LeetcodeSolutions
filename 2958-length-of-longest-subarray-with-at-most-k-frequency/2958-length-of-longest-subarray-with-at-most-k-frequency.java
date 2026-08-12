class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int i=0;
        int j=0;

        Map<Integer,Integer> mp = new HashMap<>();
        int ans = Integer.MIN_VALUE;
        while(i<nums.length){
            int val = nums[i];
            mp.put(val,mp.getOrDefault(val,0)+1);
            if(mp.get(val)>k){
                while(j<i && mp.get(val)>k){
                    mp.put(nums[j],mp.get(nums[j])-1);
                    j+=1;
                }
            }
            ans=Math.max(i-j+1,ans);
            i+=1;
        }
        // while(j<)
        //[1,2,2,1,3] k=1
        return ans;
    }
}