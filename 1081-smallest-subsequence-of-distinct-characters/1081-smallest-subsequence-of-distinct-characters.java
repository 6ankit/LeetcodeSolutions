class Solution {
    public String smallestSubsequence(String s) {
        Map<Character,Integer> mp = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char bh = s.charAt(i);
            mp.put(bh,i);
        }

        boolean[] alpha = new boolean[26];
        Stack<Character> st = new Stack<>();

        char[] bh = s.toCharArray();
        for(int i=0;i<bh.length;i++){

            int index = mp.get(bh[i]);
            if(alpha[bh[i]-'a']==true) continue;

            if(st.size()>0){
                while(st.size()>0){
                    if(st.peek()>bh[i] && mp.get(st.peek())>i){
                        alpha[st.peek()-'a']=false;
                        st.pop();
                       
                    }else break;
                }
            }
            st.push(bh[i]);
            alpha[bh[i]-'a']=true;
        }
        StringBuilder answer = new StringBuilder();
        while(st.size()>0){
            answer.append(st.peek());
            st.pop();
        }
        return answer.reverse().toString();
    }

}