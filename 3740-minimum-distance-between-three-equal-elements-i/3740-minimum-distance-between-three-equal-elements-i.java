class Solution {
    public int minimumDistance(int[] nums) {
        Map<Integer,Stack<Integer>> mp = new HashMap<>();
        int ans =Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(mp.containsKey(nums[i])){
                mp.get(nums[i]).push(i);
                if(mp.get(nums[i]).size()==3){
                    Stack<Integer> st=mp.get(nums[i]);
                    int first=st.pop();
                    int second=st.pop();
                    int third=st.pop();
                    int ans2=Math.abs(third-second)+Math.abs(second-first)+Math.abs(first-third);
                    ans=Math.min(ans,ans2);
                    st.push(second);
                    st.push(first);
                }
            }else{
                Stack<Integer> st = new Stack<>();
                st.add(i);
                mp.put(nums[i],st);
            }
        }
        if(ans==Integer.MAX_VALUE) return -1;
        return ans;
    }
}