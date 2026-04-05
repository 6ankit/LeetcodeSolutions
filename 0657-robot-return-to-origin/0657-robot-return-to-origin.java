class Solution {
    public boolean judgeCircle(String moves) {
        int r=0;
        int c=0;
        char[] ch = moves.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='D'){
                r+=1;
            }else if(ch[i]=='R'){
                c+=1;
            }else if(ch[i]=='L'){
                c-=1;
            }else{
                r-=1;
            }
        }
        if(r==0 && c==0) return true;
        return false;
    }
}