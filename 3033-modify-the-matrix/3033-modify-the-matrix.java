class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        
        int[] array = new int[matrix[0].length];

        for(int i=0;i<matrix[0].length;i++)
        {
            int maxi=Integer.MIN_VALUE;
            for(int j=0;j<matrix.length;j++)
            {
                maxi=Math.max(maxi,matrix[j][i]);
            }
            array[i]=maxi;
        }

        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                int val=matrix[i][j];
                if(val==-1){
                    matrix[i][j]=array[j];
                }
            }
        }
        return matrix;
    }
}