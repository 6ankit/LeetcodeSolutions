class Solution {
    public boolean solve(int row,int col,int[][] mat)
    {
        int countOne=0;
        
        for(int i=0;i<mat[0].length;i++)
        {
            if(mat[row][i]==1) countOne+=1;
        }

        for(int i=0;i<mat.length;i++)
        {
            if(mat[i][col]==1)countOne+=1;
        }
        return countOne==2;
    }
    public int numSpecial(int[][] mat) {
        int answer =0;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                if(mat[i][j]==1)
                {
                    if(solve(i,j,mat))answer+=1;
                }
            }
        }
        return answer;
    }
}