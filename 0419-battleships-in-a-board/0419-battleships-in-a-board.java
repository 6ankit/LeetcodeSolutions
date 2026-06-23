class Solution {

    public void DFS(int row,int col,char[][] board,boolean[][] visited){
        if(row>=board.length || col>=board[0].length || row<0 || col<0){
            return ;
        }

        if(visited[row][col]==true || board[row][col]=='.') return ;

        visited[row][col]=true;

        DFS(row+1,col,board,visited);
        DFS(row,col+1,board,visited);
        DFS(row-1,col,board,visited);
        DFS(row,col-1,board,visited);
    }

    public int countBattleships(char[][] board) {

        int row = board.length;
        int col = board[0].length;
        boolean[][] visited=new boolean[row][col];


        int ans = 0;

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j]=='X' && visited[i][j]==false){
                    ans+=1;
                    DFS(i,j,board,visited);
                }
            }
        }


        return ans;
    }
}