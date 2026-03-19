class Solution {
    public int maxDistinct(String s) {
        int[] alpha = new int[26];
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            alpha[ch[i]-'a']++;
        }
        int ans=0;
        for(int i=0;i<alpha.length;i++){
            if(alpha[i]>0) ans+=1;
        }
        return ans;
    }
}