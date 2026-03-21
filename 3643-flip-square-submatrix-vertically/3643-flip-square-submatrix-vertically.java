class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        
        int ro=x;
        int co=y;

        int siz=k;
        while(siz>0){
            int r=k+x-1;
            int c=co;
            int row=ro;
            int col=co;

            while(r>=row){
                int temp = grid[row][col];
                grid[row][col]=grid[r][c];
                grid[r][c]=temp;
                r-=1;
                row+=1;
            }
            siz-=1;
            co+=1;
        }
        return grid;
    }
}