class Solution {
    public int minInsertions(String s) {
        
        char[] ch = s.toCharArray();
        int ans = 0;
        Stack<Character> st = new Stack<>();

        int i=0;

        while(i<ch.length){
            char c=ch[i];

            if(c==')'){
                if(st.size()==0){
                    if(i+1>=ch.length){
                        ans+=2;
                        i+=1;
                    }
                    else if(ch[i+1]!=')'){
                        ans+=2;
                        i+=1;
                    }else{
                        ans+=1;
                        i+=2;
                    }
                }else{
                    if(i+1>=ch.length){
                        ans+=1;
                        i+=1;
                    }
                    else if(ch[i+1]!=')'){
                        ans+=1;
                        i+=1;
                    }else{
                        i+=2;
                    }
                    st.pop();
                }
            }
            else{
                st.push('(');
                i+=1;
            }
            // System.out.println(ans);
        }
        if(st.size()>0){
            int k =st.size()*2;
            ans+=k;
        }
        return ans;
    }
}