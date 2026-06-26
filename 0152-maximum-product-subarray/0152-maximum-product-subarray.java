class Solution {
    public int maxProduct(int[] nums) {

        int maxi = Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            maxi=Math.max(nums[i],maxi);
            int product = nums[i];
            for(int j=i+1;j<nums.length;j++){
                product*=nums[j];
                maxi=Math.max(maxi,product);
            }
        } 
        return maxi;
    }
}