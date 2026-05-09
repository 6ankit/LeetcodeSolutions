class Solution {
    public int[][] rotateGrid(int[][] grid, int k) {

       
            boolean[][] visited=new boolean[grid.length][grid[0].length];
            int i=0;
            int j=0;
            while(i<grid.length && j<grid[0].length && visited[i][j]==false)
            {
                List<Integer> temp =  new ArrayList<>();
                int row=i;
                int col=j;

                while(col<grid[0].length && visited[row][col]==false)
                {
                    temp.add(grid[row][col]);
                    col+=1;
                }
                col-=1;
                row+=1;
                while(row<grid.length  && visited[row][col]==false)
                {   
                    temp.add(grid[row][col]);
                    row+=1;
                }
                row-=1;
                // col=row;
                col-=1;
                while(col>=j &&visited[row][col]==false)
                {
                    temp.add(grid[row][col]);
                    col-=1;
                }
                col=j;
              

                row-=1;

                while(row>i  && visited[row][col]==false)
                {
                    temp.add(grid[row][col]);
                    row-=1;
                }
                int rotate = k % temp.size();
                List<Integer> temp2 = new ArrayList<>();
                for(int m=rotate;m<temp.size();m++)
                {
                    temp2.add(temp.get(m));
                }
                for(int m=0;m<rotate;m++)
                {
                    temp2.add(temp.get(m));
                }
                // 40 30 20 10
                // 10 40 30 20

                row=i;
                col=j;

               row=i;
               col=j;
               int ml=0;

               while(col<grid[0].length && visited[row][col]==false)
               {
                grid[row][col]=temp2.get(ml);
                visited[row][col]=true;
                ml+=1;
                col+=1;
                }

                col-=1;
                row+=1;
                while(row<grid.length && visited[row][col]==false)
                {
                    grid[row][col]=temp2.get(ml);
                    ml+=1;
                    visited[row][col]=true;
                    row+=1;
                }
                row-=1;
                col-=1;
                while(col>=j && visited[row][col]==false)
                {
                    grid[row][col]=temp2.get(ml);
                    ml+=1;
                    visited[row][col]=true;
                    col-=1;
                }
                col=j;
                row-=1;
                while(row>=i && visited[row][col]==false)
                {
                    grid[row][col]=temp2.get(ml);
                    ml+=1;
                    visited[row][col]=true;
                    row-=1;
                }
                 i+=1;
                 j+=1;


            }
            k-=1;
        
        return grid;
    }
}