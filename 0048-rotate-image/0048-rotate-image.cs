public class Solution {
    public void Rotate(int[][] matrix) {
        
        int row = matrix.Length;
        int col = matrix[0].Length;

        int[][] temp = new int[row][];
        for (int i = 0; i < row; i++)
        {
            temp[i] = new int[col];
        }

        row=0;
        col=col-1;

        for(int i=0;i<matrix.Length;i++)
        {
            for(int j=0;j<matrix[i].Length;j++)
            {
                temp[row][col]=matrix[i][j];
                row+=1;
            }
            row=0;
            col-=1;
        }

        for(int i=0;i<temp.Length;i++)
        {
            for(int j=0;j<temp[i].Length;j++)
            {
                matrix[i][j]=temp[i][j];
            }
        }
    }
}