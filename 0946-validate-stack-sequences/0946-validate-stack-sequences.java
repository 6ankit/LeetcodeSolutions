class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        
        Stack<Integer> st = new Stack<>();
        int i=0;
        int j=0;
        while(i<pushed.length){
            st.push(pushed[i]);
            i+=1;
             while(st.size()>0 && j<popped.length && st.peek()==popped[j]){
                st.pop();
                j+=1;
            }
        }
        return st.size()==0 ? true : false;
    }
}