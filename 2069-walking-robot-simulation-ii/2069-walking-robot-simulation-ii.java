class Robot {

    int[][] grid;
    char side='E';
    int row=0;
    int col=0;
    public Robot(int width, int height) {
        grid=new int[width][height];
        side='E';
    }
    
    public void step(int num) {
        num %= (2 * (grid.length - 1) + 2 * (grid[0].length - 1));
        if (num == 0) {
            num = (2 * (grid.length - 1) + 2 * (grid[0].length - 1));
        }
        while(num>0){
            if(side=='E'){
                row+=1;
                if(row>=grid.length){
                    side='N';
                    row-=1;
                    continue;
                }
            }else if(side=='N'){
                col+=1;
                if(col==grid[0].length){
                    col-=1;
                    side='W';
                    continue;
                }
            }else if(side=='W'){
                row-=1;
                if(row<0){
                    row=0;
                    side='S';
                    continue;
                }
            }else{
                col-=1;
                if(col<0){
                    col=0;
                    side='E'; 
                    continue;  
                }
            }
            num-=1;
        }
    }
    
    public int[] getPos() {
        int[] ans = {row,col};
        return ans;   
    }
    
    public String getDir() {
        if(side=='E') return "East";
        if(side=='W') return "West";
        if(side=='S') return "South";
        return "North";
    }
}

/**
 * Your Robot object will be instantiated and called as such:
 * Robot obj = new Robot(width, height);
 * obj.step(num);
 * int[] param_2 = obj.getPos();
 * String param_3 = obj.getDir();
 */