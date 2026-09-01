class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> st = new HashSet<>();
        int mid = candyType.length/2;

        for(int i=0;i<candyType.length;i++){
            if(st.size()>=mid){
                break;
            }
            st.add(candyType[i]);
        }
        return st.size();
    }
}