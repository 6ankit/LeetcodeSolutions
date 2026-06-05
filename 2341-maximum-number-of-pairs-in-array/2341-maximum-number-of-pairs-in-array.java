class Solution {
    public int[] numberOfPairs(int[] nums) {
        
        Map<Integer,Integer> mp = new HashMap<>();
        int pair = 0;
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
            if(mp.get(nums[i])==2){
                pair+=1;
                mp.put(nums[i],0);
            }
        }
        int rem = 0;
        for(Map.Entry<Integer,Integer> m:mp.entrySet()){
            if(m.getValue()==1) rem+=1;
        }
        int[] ans = {pair,rem};
        return ans;
    }
}