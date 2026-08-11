class Solution {
    public int missingInteger(int[] nums) {
        
        int sum = nums[0];
        
        Set<Integer> st = new HashSet<>();
        for(int t:nums){
            st.add(t);
        }

        for(int i=1;i<nums.length;i++){
            if(nums[i-1]+1==nums[i]){
                sum+=nums[i];
            }
            else break;
        }
        while(st.contains(sum)){
            sum+=1;
        }
        return sum;
    }
}