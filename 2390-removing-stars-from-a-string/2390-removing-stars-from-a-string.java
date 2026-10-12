class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        char[] ch = s.toCharArray();

        for(int i=0;i<ch.length;i++){
            if(ch[i]=='*'){
                if(!st.empty()){
                    st.pop();
                }
            }
            else{
                st.push(ch[i]);
            }
        }
        StringBuilder ans = new StringBuilder();
        while(!st.empty()){
            ans.append(st.peek());
            st.pop();
        }
        return ans.reverse().toString();
    }
}