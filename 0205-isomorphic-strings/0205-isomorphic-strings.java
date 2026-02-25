class Solution {
    public boolean isIsomorphic(String s1, String s2) {
         if(s1.length() != s2.length()) return false;
        // code here
        Map<Character,Character> mp = new HashMap<>();
        Map<Character,Character> mp2=new HashMap<>();
       
        int i=0;
        int j=0;
        while(i<s1.length() && j<s2.length()){
            char first = s1.charAt(i);
            char second = s2.charAt(j);
            
            if(mp.containsKey(first)){
                if(mp.get(first)!=second) return false;
            }
            else if(mp2.containsKey(second)){
                if(mp2.get(second)!=first) return false;
            }
            else {
                mp.put(first,second);
                mp2.put(second,first);
            }
            i+=1;
            j+=1;
        }
        return true;
    }
}