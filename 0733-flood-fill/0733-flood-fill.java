class Solution {

    public void DFS(int[][] image,int color,int row,int col,boolean[][] visited,int value){
            if(row>=image.length || row<0 || col>=image[0].length || col<0){
                return ;
            }
            int val = image[row][col];
            if(val!=value) return ;
            if(visited[row][col]==true) return ;
            visited[row][col]=true;

            image[row][col]=color;
            DFS(image,color,row+1,col,visited,value);
            DFS(image,color,row-1,col,visited,value);
            DFS(image,color,row,col-1,visited,value);
            DFS(image,color,row,col+1,visited,value); 
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
        boolean[][] visited = new boolean[image.length][image[0].length];
        DFS(image,color,sr,sc,visited,image[sr][sc]);
        return image;

    }
}