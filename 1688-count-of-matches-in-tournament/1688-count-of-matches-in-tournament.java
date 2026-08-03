class Solution {
    public int numberOfMatches(int n) {
        int ans = 0;
        // System.out.println(n/2);
        while(n>=1){
            int k=n-(n/2);
            // System.out.println(k);
            ans+=n/2;
            n=k;
            if(n==1) break;
        }
        return ans;
    }
}