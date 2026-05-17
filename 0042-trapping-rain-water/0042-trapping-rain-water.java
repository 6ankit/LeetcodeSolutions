class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] prefMax=new int[n];
        int[] suffMax=new int[n];
        prefMax[0]=height[0];
        for(int i=1;i<n;i++){
            prefMax[i]=Math.max(prefMax[i-1],height[i]);
        }
        suffMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            suffMax[i]=Math.max(suffMax[i+1],height[i]);
        }
        int i=n-1;
        int ans =0;
        while(i>=0){

            int val=prefMax[i];
            int val2=suffMax[i];
            int temp = Math.min(val,val2);
            int t=temp-height[i];
            ans+=t;
            i-=1;
        }
        return ans;
    }
}