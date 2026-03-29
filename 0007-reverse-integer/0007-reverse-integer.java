class Solution {
    public int reverse(int x) {
        if(x==Integer.MIN_VALUE){
            return 0;
        }
        boolean flag=false;
        if(x<0){
            x=Math.abs(x);
            flag=true;
        }
        int answer = 1;
        int val=10;
        answer=x%10;
        x/=10;
        while(x>0){
            int temp=x%10;
            if (answer > Integer.MAX_VALUE / 10 || answer < Integer.MIN_VALUE / 10) {
            return 0;
            }
            answer = answer*val;
            x/=10;
            answer+=temp;
        }
        if(flag==true) return -answer;
        return answer;
    }
}