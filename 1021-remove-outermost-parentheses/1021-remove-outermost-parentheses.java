class Solution {
    public String removeOuterParentheses(String s) {
        List<String> validParenthesis = new ArrayList<>();
        Stack<Character> st  = new Stack<>();

        StringBuilder sb = new StringBuilder();
        for(char c:s.toCharArray()){
            if(c==')'){
                if(st.size()==1){
                    sb.append(')');
                    st.pop();
                    validParenthesis.add(sb.toString());
                    sb=new StringBuilder();
                }else{
                    sb.append(')');
                    st.pop();
                }
            }else{
                st.push('(');
                sb.append('(');
            }
            
        }
        String ans = "";
        for(int i=0;i<validParenthesis.size();i++){
           String temp = validParenthesis.get(i);
           String temp2=temp.substring(1,temp.length()-1);
           ans+=temp2;
        }
        return ans;
    }
}