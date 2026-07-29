class Solution {
    public int minOperations(String[] logs) {
        Stack<String> st = new Stack<>();
        for(String s:logs){
            if(s.equalsIgnoreCase("../")){
                if(st.size()>0){
                    st.pop();
                }
            }else if(!s.equalsIgnoreCase("./")){
                st.push(s);
            }
        }
        return st.size();
    }
}