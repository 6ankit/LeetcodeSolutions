class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int i=0;
        int index = 0;
        int j=nums.length/2;

        while(j<nums.length && index<nums.length){
            ans[index]=nums[i];
            i+=1;
            index+=1;
            ans[index]=nums[j];
            j+=1;
            index+=1;
        }
        return ans;
    }
}