class Solution {
    public void rotate(int[][] matrix) {
        
        int row = matrix.length;
        int col = matrix[0].length;

        int[][] temp=new int[row][col];

        row=0;
        col=col-1;

        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                temp[row][col]=matrix[i][j];
                row+=1;
            }
            row=0;
            col-=1;
        }

        for(int i=0;i<temp.length;i++)
        {
            for(int j=0;j<temp[i].length;j++)
            {
                matrix[i][j]=temp[i][j];
            }
        }
    }
}