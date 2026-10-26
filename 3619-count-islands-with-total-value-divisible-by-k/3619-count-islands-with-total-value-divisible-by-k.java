class Solution {
    public long DFS(int row,int col,int k,int[][] grid){
        if(row>=grid.length || row<0 || col>=grid[row].length || col<0){
            return 0L;
        }
        if(grid[row][col]==0){
            return 0L;
        }
        long val = grid[row][col];
        grid[row][col]=0;

        long first = DFS(row+1,col,k,grid);
        long second = DFS(row-1,col,k,grid);
        long third = DFS(row,col+1,k,grid);
        long fourth =  DFS(row,col-1,k,grid); 

        long ans = first+second+third+fourth;
        ans+=val;
        return ans;
    }
    public int countIslands(int[][] grid, int k) {
        
        int ans = 0;

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]>0){
                    long val = DFS(i,j,k,grid);
                    if(val>0 && val%k==0) ans+=1;
                }
            }
        }
        return ans;
    }
}