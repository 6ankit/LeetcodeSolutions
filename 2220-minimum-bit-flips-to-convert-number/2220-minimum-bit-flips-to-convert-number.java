class Solution {


    public StringBuilder getBitString(int n){
        StringBuilder s = new StringBuilder();
        while(n>0){
            s.append(n%2);
            n/=2;
        }
        return s;
    }
    public int minBitFlips(int start, int goal) {
       StringBuilder first = getBitString(start);
       StringBuilder second = getBitString(goal);
       first.reverse();
       second.reverse();
       if(first.length()<second.length()){
            int m=second.length()-first.length();
            StringBuilder p = new StringBuilder();
            while(m>0){
                p.append('0');
                m-=1;
            }
            p.append(first);
            first=p;
       }
       else if(first.length()>second.length()){
            int m=first.length()-second.length();
            StringBuilder p = new StringBuilder();
            while(m>0){
                p.append('0');
                m-=1;
            }
            p.append(second);
            second=p;
       }
       int ans = 0;
       for(int i=0;i<first.length();i++){
        if(first.charAt(i)!=second.charAt(i)){
            ans+=1;
        }
       }
       return ans;
    }
}