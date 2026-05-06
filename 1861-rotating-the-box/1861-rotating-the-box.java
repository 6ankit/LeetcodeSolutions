class Solution {
    public char[][] getRotation(int row,int col,char[][] boxGrid)
    {
        char[][] temp = new char[col][row];
        int r = 0;
        int c = 0;
        for(int i=boxGrid.length-1;i>=0;i--)
        {
            for(int j=0;j<boxGrid[i].length;j++)
            {
                temp[r][c] = boxGrid[i][j];
                r += 1;
            }
            c += 1;
            r = 0;
        }
        return temp;
    }
    public char[][] rotateTheBox(char[][] boxGrid) {

        int row = boxGrid.length;
        int col = boxGrid[0].length;



        for(int i=0;i<boxGrid.length;i++)
        {
            int r=0;
            int flag=0;
            for(int j=0;j<=boxGrid[i].length;j++)
            {
                if(j==boxGrid[0].length || boxGrid[i][j]=='*')
                {
                    int c=j-1;
                    while(r<c) {
                        flag += 1;
                        char ch = boxGrid[i][r];
                        char bh = boxGrid[i][c];
                        if (ch == '#' && bh == '.') {
                            boxGrid[i][r]='.';
                            boxGrid[i][c]='#';
                            r += 1;
                            c -= 1;
                        } else if (ch == '.' && bh == '#') {
                            c -= 1;
                            r += 1;
                        } else if (bh == '.' && ch == '.') {
                            r += 1;
                        } else {
                            c -= 1;
                        }
                    }
                    r=j+1;
                }

            }
        }
        char[][] temp = getRotation(row,col,boxGrid);
        return temp;
        // return boxGrid;
    }
}
