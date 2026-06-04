class Solution {
    public int totalWaviness(int num1, int num2) {
        int ans = 0;
        for(int i=num1;i<=num2;i++){
            int temp = i;
            int last = Integer.MIN_VALUE;
            int middle = Integer.MIN_VALUE;
            if(temp>0){
                last = temp%10;
                temp/=10;
            }
            if(temp>0){
                middle = temp%10;
                temp/=10;
            }
            while(temp>0){
               int first = temp%10;
               temp/=10;
               if(middle>last && middle>first) ans+=1;
               else if(middle<last && middle<first) ans+=1;
               int t=middle;
               last = t;
               middle = first;
            }
        }
        return ans;
    }
}