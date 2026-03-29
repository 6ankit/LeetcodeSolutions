class Solution {
    public int firstMatchingIndex(String s) {
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch.length-i-1<ch.length){
                if(ch[i]==ch[ch.length-i-1]) return i;
            }
        }
        return -1;
    }
}