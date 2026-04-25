class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
       Set<Integer> st = new HashSet<>();
       for(int i=0;i<nums2.length;i++){
        st.add(nums2[i]);
       }
       Set<Integer> st2=new HashSet<>();
       int first = 0;
        for(int i=0;i<nums1.length;i++){
            if(st.contains(nums1[i])){
                first+=1;
            }
            st2.add(nums1[i]);
        }
        int second =0;
        for(int i=0;i<nums2.length;i++){
            if(st2.contains(nums2[i])){
                second+=1;
            }
        }
        int[] ans = new int[2];
        ans[0]=first;
        ans[1]=second;
        return ans;
    }
}