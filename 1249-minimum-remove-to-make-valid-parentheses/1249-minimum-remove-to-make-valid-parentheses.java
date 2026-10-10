class Solution {
    public String minRemoveToMakeValid(String s) {
        
        char[] ch = s.toCharArray();
        Stack<Integer> st = new Stack<Integer>();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='('){
                st.push(i);
            }else if(ch[i]==')'){
                if(st.empty()){
                    ch[i]='$';
                }else st.pop();
            }
        }
        while(!st.empty()){
            ch[st.peek()]='$';
            st.pop();
        }
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<ch.length;i++){
            if(ch[i]!='$'){
                ans.append(ch[i]);
            }
        }
        return ans.toString();
    }
}