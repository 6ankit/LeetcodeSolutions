class Solution {
    public int maximumLengthSubstring(String s) {
        
        int[] alpha = new int[26];
        int j=0;
        int length=Integer.MIN_VALUE;
        
        char[] ch = s.toCharArray();
        int i=0;
        while(i<ch.length){
            int index = ch[i]-'a';

            alpha[index]+=1;

           
            while(alpha[index]>=3 && j<i){
                alpha[ch[j]-'a']-=1;
                j+=1;
            }
            
            length=Math.max(length,i-j+1);
            i+=1;
        }
        return length;
    }
}