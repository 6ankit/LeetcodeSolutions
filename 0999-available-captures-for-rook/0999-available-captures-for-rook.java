class Solution {
    public int numRookCaptures(char[][] board) {
        int ans =0;
        int row=0;
        int col=0;
        boolean flag=false;

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j]=='R'){
                    row=i;
                    col=j;
                    flag=true;
                    break;
                }
            }
            if(flag==true)break;
        }
        System.out.println(row+" "+col);
        for(int i=row;i<board.length;i++){
            if(board[i][col]=='B') break;
            if(board[i][col]=='p'){
                ans+=1;
                break;
            }
        }
        for(int i=row;i>=0;i--){
            if(board[i][col]=='B') break;
            if(board[i][col]=='p'){
                ans+=1;
                break;
            }
        }
        for(int i=col;i<board[0].length;i++){
            if(board[row][i]=='B')break;
            if(board[row][i]=='p'){
                ans+=1;
                break;
            }
        }
        for(int i=col;i>=0;i--){
            if(board[row][i]=='B')break;
            if(board[row][i]=='p'){
                ans+=1;
                break;
            }
        }
        return ans;
    }
}