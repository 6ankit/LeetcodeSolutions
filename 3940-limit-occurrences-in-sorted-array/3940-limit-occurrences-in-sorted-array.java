class Solution {
    public int[] limitOccurrences(int[] nums, int k) {


        Map<Integer,Integer> mp = new HashMap<>();
        List<Integer> ans = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
            if(mp.get(nums[i])<=k){
                ans.add(nums[i]);
            }
        }   
        return ans.stream().mapToInt(i->i.intValue()).toArray();
    }

}