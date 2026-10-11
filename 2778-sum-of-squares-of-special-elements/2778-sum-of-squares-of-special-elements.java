class Solution {
    public int sumOfSquares(int[] nums) {
       int[] ans = new int[1];
       int[] index={0};
       Arrays.stream(nums).
       peek(i->++index[0]).
       filter(i->nums.length%index[0]==0)
       .peek(i->ans[0]+=(i*i))
       .count();
       return ans[0];
    }
}