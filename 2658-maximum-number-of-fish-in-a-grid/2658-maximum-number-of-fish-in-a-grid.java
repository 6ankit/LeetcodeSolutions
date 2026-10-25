class Solution {
    public int DFS(int row,int col,int[][] grid){
        if(row>=grid.length || row<0 || col>=grid[row].length || col<0){
            return 0;
        }
        if(grid[row][col]==0){
            return 0;
        }
        int val=grid[row][col];
        grid[row][col]=0;
        int maxi1=DFS(row-1,col,grid);
        int maxi2=DFS(row+1,col,grid);
        int maxi3=DFS(row,col-1,grid);
        int maxi4=DFS(row,col+1,grid);
        
        int ans = maxi1+maxi2+maxi3+maxi4;
        ans+=val;
        return ans;
    }
    public int findMaxFish(int[][] grid) {
        int maxi = Integer.MIN_VALUE;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
               if(grid[i][j]>0) maxi=Math.max(maxi,DFS(i,j,grid));
            }
        }
     
        return maxi == Integer.MIN_VALUE ? 0 : maxi;
    }
}