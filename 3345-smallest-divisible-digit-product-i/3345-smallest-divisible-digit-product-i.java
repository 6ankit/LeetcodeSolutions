class Solution {
    public int smallestNumber(int n, int t) {
        
        for(int i=n;i<=100;i++){
            int x=i;
            int temp = 1;
            while(x>0){
                temp*=x%10;
                x/=10;
            }
            if(temp%t==0){
                return i;
            }
        }
        return -1;
    }
}