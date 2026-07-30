class Solution {
    public int minimumPushes(String word) {
            int ans = 0;
            int temp = 1;
            int x = 8;

            int i=0;
            while(i<word.length()){
                if(i<x){
                    ans+=temp;
                }
                i+=1;
                if(i==x){
                    x+=8;
                    temp+=1;
                }
            }
            return ans;
    }
}