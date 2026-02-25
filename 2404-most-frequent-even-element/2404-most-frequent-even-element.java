class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer,Integer> mp = new HashMap<>();

        int maxi = Integer.MIN_VALUE;
        int val = -1;
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
            if(nums[i]%2==0){
                if(maxi==mp.get(nums[i])){
                    val=Math.min(val,nums[i]);
                }
                else if(maxi<mp.get(nums[i])){
                    val=nums[i];
                    maxi=mp.get(nums[i]);
                }
            }

        }
        return val;
        
    }
}