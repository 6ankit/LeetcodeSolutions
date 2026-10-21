class Solution {
    
    public void getSets(int[] nums,int index,List<List<Integer>> subsest,List<Integer> singleSubSet,Set<List<Integer>> st){
        if(index>=nums.length){
            List<Integer> temp = new ArrayList<>(singleSubSet);
            Collections.sort(temp);
            if(!st.contains(temp)){
                subsest.add(new ArrayList<>(temp));
                st.add(new ArrayList<>(temp));
            }
            return;
        }

        singleSubSet.add(nums[index]);
        getSets(nums,index+1,subsest,singleSubSet,st);
        singleSubSet.remove(singleSubSet.size()-1);
        getSets(nums,index+1,subsest,singleSubSet,st);

    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Set<List<Integer>> st = new HashSet<>();
        List<List<Integer>> subsest=new ArrayList<>();
        List<Integer> singleSubSet=new ArrayList<>();
        getSets(nums,0,subsest,singleSubSet,st);
        return subsest;
    }
}