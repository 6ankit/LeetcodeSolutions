/*
*  author AnkitLekharjani 6ankit
*  @param An array of String
*  @return an integer value
*/
class Solution {
    public int calPoints(String[] operations) {
        
        Stack<Integer> st = new Stack<>();
        
        for(int i=0;i<operations.length;i++){
            String c=operations[i];

            if(c.charAt(0)=='D'){
                if(st.size()>0){
                    st.push(st.peek()*2);
                }
            }else if(c.charAt(0)=='C'){
                if(st.size()>0) st.pop();
            }else if(c.charAt(0)=='+'){
                if(st.size()>=2){
                    int first = st.peek();
                    st.pop();
                    int second = st.peek();
                    st.pop();
                    int third=first+second;
                    st.push(second);
                    st.push(first);
                    st.push(third);
                }
            }else{
                st.push(Integer.parseInt(c));
            }
        }
        int ans = 0;
        while(st.size()>0){
           ans+=st.peek();
           st.pop();
        }
        return ans;
    }
}