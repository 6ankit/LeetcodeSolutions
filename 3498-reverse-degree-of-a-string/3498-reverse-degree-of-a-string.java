class Solution {
    public int reverseDegree(String s) {
        char[] ch=s.toCharArray();
        int ans =0;
        for(int i=0;i<ch.length;i++){
            int val = 27-(ch[i]-'a')-1;
            val*=i+1;
            ans+=val;
        }
        return ans;
    }
}