class Solution {
    public String reverseParentheses(String s) {
       
       Stack<Character> st = new Stack<>();

       char[] ch = s.toCharArray();
       for(int i=0;i<ch.length;i++){
            if(ch[i]==')'){
                StringBuilder temp = new StringBuilder(1000);
                while(st.size()>0 && st.peek()!='('){
                    temp.append(st.peek());
                    st.pop();
                }
                st.pop();
                for(int j=0;j<temp.length();j++){
                    st.push(temp.charAt(j));
                }
            }else {
                st.push(ch[i]);
            }
       }
       StringBuilder ans = new StringBuilder(st.size());
       while(st.size()>0){
            ans.append(st.peek());
            st.pop();
       }
       return ans.reverse().toString();
    }
}