class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        List<List<Integer>> subArrays = new ArrayList<>();

        int ans = 0;
        for(int i=0;i<nums.length;i++){
           Map<Integer,Integer> mp = new HashMap<>();
           mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
          
           if(mp.containsKey(target)){
             if(mp.get(target)>(1/2)) ans+=1;
           }


           for(int j=i+1;j<nums.length;j++){
                mp.put(nums[j],mp.getOrDefault(nums[j],0)+1);
                int len=(j-i+1)/2;
                if(mp.containsKey(target)){
                    if(mp.get(target)>len) ans+=1;
                }
           }

        }


        // int ans = 0;
        
        return ans;
    }
}