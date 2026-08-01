class Solution {
    int p1 =Integer.MIN_VALUE;
    int p2 =Integer.MIN_VALUE;

    public int solve(int[] nums,int start,int end){
        if(start==end){
            return nums[start];
        }
        int first = nums[start] - solve(nums,start+1,end);
        int second = nums[end] - solve(nums,start,end-1);
        return Math.max(first,second);
    }
    public boolean predictTheWinner(int[] nums) {
        return solve(nums,0, nums.length- 1) >= 0;
    }
}