class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n=nums.length;
        int[] ans = new int[n];
        int index = 0;
        int pivotCount = 0;


        for(int i=0;i<n;i++){
            if(nums[i]==pivot){
                pivotCount+=1;
            }else if(nums[i]<pivot){
                ans[index]=nums[i];
                index+=1;
            }
        }

        while(pivotCount>0){
            ans[index]=pivot;
            index+=1;
            pivotCount-=1;
        }

        for(int i=0;i<n;i++){
            if(nums[i]>pivot){
                ans[index]=nums[i];
                index+=1;
            }
        }

        return ans;
    }
}