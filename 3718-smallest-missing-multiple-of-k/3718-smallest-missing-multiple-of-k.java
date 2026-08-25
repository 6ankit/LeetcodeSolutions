class Solution {
    public int missingMultiple(int[] nums, int k) {
        
        Set<Integer> st = new HashSet<>();
        for(int i:nums){
            st.add(i);
        }
        
        int n=k;
        while(st.contains(k)){
            k+=n;
        }
        return k;
    }
}