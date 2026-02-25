class Solution {
    public String greatestLetter(String s) {
        int maxi = Integer.MIN_VALUE;
        Set<Character> st = new HashSet<>();

        for(char ch:s.toCharArray())
        {
            st.add(ch);
        }

        Iterator<Character> it = st.iterator();
        String ans="";
        while(it.hasNext())
        {
            char ch = it.next();
            if(ch<97)
            {
               char small=(char)(ch+32);
               if(st.contains(small)){
                    if(maxi<(int)ch){
                        maxi=(int)ch;
                    }
               }
            }
        }
        if(maxi==Integer.MIN_VALUE) return "";
        ans=ans+(char)maxi;
        return ans;
    }
}