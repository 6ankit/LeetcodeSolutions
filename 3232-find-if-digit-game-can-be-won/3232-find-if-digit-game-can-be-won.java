class Solution {
    public boolean canAliceWin(int[] nums) {
        int singlNumber = 0;
        int doubleNumber=0;
        for(int i=0;i<nums.length;i++){
                int temp = nums[i];
                temp=temp/10;
                if(temp<=0){
                    singlNumber+=nums[i];
                }
                else doubleNumber+=nums[i];
        }
        if(doubleNumber==singlNumber) return false;
        return true;
    }
}