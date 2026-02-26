// import java.util.concurrent.atomic.AtomicInteger;
class Solution {
    public int[] evenOddBit(int n) {
        String s=Integer.toBinaryString(n);
        int even =0;
        int index=0;
        int odd=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            if(index%2==0){
                if(s.charAt(i)=='1') even+=1;
            }
            else{
                if(s.charAt(i)=='1')odd+=1;
            }
            index+=1;
        }
        int[] ans = new int[2];
        ans[0]=even;
        ans[1]=odd;
        return ans;
    }
}