class Solution {
    public boolean dfs(int row,int col,int val,int[][] grid){
        if(row>=grid.length || col>=grid[0].length || col<0 || row<0){
            return false;
        }
        if(grid[row][col]==7 || grid[row][col]==1) return true;
        if(grid[row][col]==0) grid[row][col]=7;
       return dfs(row-1,col,val,grid) &
        dfs(row,col+1,val,grid) &
        dfs(row+1,col,val,grid)  &
        dfs(row,col-1,val,grid);
    }
    public int closedIsland(int[][] grid) {
        
        int ans = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==0){
                    if(dfs(i,j,grid[i][j],grid)){
                        ans+=1;
                    }
                }
            }
        }
        return ans;
    }
}