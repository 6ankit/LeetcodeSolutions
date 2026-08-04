class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        
        int maxi=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        Set<Integer> st = new HashSet<>();

        for(int a:nums){
            maxi=Math.max(maxi,a);
            min=Math.min(min,a);
             st.add(a);
        }

        List<Integer> ans = new ArrayList<>();
        for(int i=min;i<=maxi;i++){
            if(!st.contains(i)){
                ans.add(i);
            }
        }

        return ans;
    }
}