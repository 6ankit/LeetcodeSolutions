class Solution {
    public int max(int[] arr,int index,int d,int[] dp,boolean[] visited){
        if(index>=arr.length || index<0){
            return 0;
        }
        if(dp[index]!=0) return dp[index];
        visited[index]=true;
        int t=d;
        int maxi=0;
        int i=1;
        int ans1=1;
        int ans2=1;
        boolean flag1 = false;
        boolean flag = false;
        while(t>0){
            if(index+i<arr.length && flag1==false){
               if(arr[index+i]<arr[index]) ans1 = Math.max(ans1, 1 + max(arr, index + i, d, dp, visited));
               else flag1=true;
            }
            if(index-i>=0){
              if(arr[index-i]<arr[index] && flag==false) ans2 = Math.max(ans2, 1 + max(arr, index -i, d, dp, visited));
              else flag=true;
            }
            t-=1;
            i+=1;
        }
         maxi=Math.max(maxi,Math.max(ans1,ans2));
        dp[index]=maxi;
        return maxi;

    }
    public int maxJumps(int[] arr, int d) {
            int[] dp = new int[arr.length];
            boolean[] visited = new boolean[arr.length];

            for(int i=0;i<arr.length;i++){
                 max(arr,i,d,dp,visited);

            }
            int maxi=Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++){

                maxi=Math.max(dp[i],maxi);

            }
            return maxi;
    }
}