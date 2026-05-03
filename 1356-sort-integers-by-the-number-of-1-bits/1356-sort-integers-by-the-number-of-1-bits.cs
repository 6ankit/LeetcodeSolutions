public class Solution {
    public int getSetCount(int ele)
    {
        int setBitCount = 0;
        while(ele>0){
            if(ele%2==1){
                setBitCount+=1;
            }
            ele/=2;
        }
        return setBitCount;
    }
    public int[] SortByBits(int[] arr) {
        
        Array.Sort(arr,(a,b)=>{
            int val1=getSetCount(a);
            int val2=getSetCount(b);
            if(val1==val2) return a-b;
            return val1-val2;
        });
        return arr;
    }
}