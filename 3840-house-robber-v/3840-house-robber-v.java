class Solution {
    public long robTheHouse(int[] nums,int[] colors,int index,int color,long[] dp){
        if(index>=nums.length){
            return 0;
        }
        
        int money=nums[index];
        int c=colors[index];

        if(dp[index]!=-1) return dp[index];
        long ans1 = 0;
        long ans2=0;
        long ans3=0;
        if(index+1<nums.length){
            if(colors[index+1]!=c){
                ans2=money+robTheHouse(nums,colors,index+1,c,dp);
            }else{
                ans3=money+robTheHouse(nums,colors,index+2,c,dp);
            }
            ans1=0+robTheHouse(nums,colors,index+1,c,dp);
        }
        else{
            ans1=money+robTheHouse(nums,colors,index+1,c,dp);
        }
        dp[index]=Math.max(ans1,Math.max(ans2,ans3));
        return dp[index];
    }
    public long rob(int[] nums, int[] colors) {

        long[] dp = new long[nums.length];

        for(int i=0;i<dp.length;i++) dp[i]=-1;
        return robTheHouse(nums,colors,0,colors[0],dp);
    }
}