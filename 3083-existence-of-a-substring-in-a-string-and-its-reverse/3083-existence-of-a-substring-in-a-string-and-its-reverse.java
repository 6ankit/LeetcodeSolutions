class Solution {
    public boolean isSubstringPresent(String s) {
        Set<String> st = new HashSet<>();

        char[] ch = s.toCharArray();

        for(int i=0;i<ch.length-1;i++){
            st.add(ch[i]+""+ch[i+1]);
        }
        // System.out.println(st);
        for(int i=ch.length-1;i>0;i--){
            // System.out.println(ch[i]+""+ch[i-1]);
            if(st.contains(ch[i]+""+ch[i-1])) return true;
        }
        // ab bc cd
        // dc cd ba 
        return false;
    }
}