class Solution {
    Set<Integer> st;
    Set<List<Integer>> ans;
    public void solve(int k,int n,int sum){
         if(sum>=n){
            if(st.size()==k && sum==n){
                List<Integer> temp = new ArrayList<>();
                Iterator<Integer> it=st.iterator();
                while(it.hasNext()){
                    temp.add(it.next());
                }
                ans.add(temp);
            }
            return;
         }
         for(int i=1;i<=9;i++){
            if(!st.contains(i)){
                st.add(i);
                solve(k,n,sum+i);
                st.remove(i);
            }
         }

    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        st=new HashSet<>();
        ans = new HashSet<>();
        solve(k,n,0);
        List<List<Integer>> answer = new ArrayList<>();
        Iterator<List<Integer>> it=ans.iterator();
        while(it.hasNext())
        {
            answer.add(it.next());
        }
        return answer;
    }
}