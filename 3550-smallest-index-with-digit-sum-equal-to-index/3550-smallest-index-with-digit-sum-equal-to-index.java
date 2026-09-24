class Solution {

    public boolean getValidSum(int n,int index){
        int sum = 0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        if(sum>index || sum<index){
            return false;
        }
        return true;
    }
    public int smallestIndex(int[] nums) {
        
        for(int i=0;i<nums.length;i++){
            if(getValidSum(nums[i],i)){
                return i;
            }
        }
        return -1;
    }
}