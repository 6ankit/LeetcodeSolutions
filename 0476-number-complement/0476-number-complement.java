class Solution {
    public int findComplement(int num) {
        int pow =1;
        int answer = 0;
        while(num>0)
        {
            int rem = num%2;
            if(rem==0){
                answer+=pow;
            }
            pow*=2;
            num/=2;
        }
        return answer;
    }
}