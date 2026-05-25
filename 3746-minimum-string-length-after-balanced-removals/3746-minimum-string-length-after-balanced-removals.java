class Solution {
    public int minLengthAfterRemovals(String s) {
        
        
        Stack<Character> st = new Stack<>();

        char[] ch = s.toCharArray();

        st.push(ch[0]);

        for(int i=1;i<ch.length;i++){
            if(st.size()>0){
                if(st.peek()!=ch[i]){
                    st.pop();
                }else{
                    st.push(ch[i]);
                }
            }
            else{
                st.push(ch[i]);
            }
        }
        return st.size();
    }
}