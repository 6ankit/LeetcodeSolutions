class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        
        // 3 4
        int[] odd = new int[nums.length/2];
        int[] even = new int[nums.length/2];
        int r=0;
        int e=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0) 
            {
                even[e]=nums[i];
                e+=1;
            }
            else{
                odd[r]=nums[i];
                r+=1;
            }
        }
        int i=0;
        int index=0;
        int j=0;
        while(i<odd.length || j<even.length)
        {
            if(index%2==0)
            {
                nums[index]=even[j];
                j+=1;
            }
            else
            {
                nums[index]=odd[i];
                i+=1;
            }
            index+=1;
        }
        return nums;
    }
}