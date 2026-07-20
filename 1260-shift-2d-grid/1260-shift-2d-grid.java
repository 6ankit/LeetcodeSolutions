class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        
        while(k>0){
            int value = grid[grid.length-1][grid[0].length-1];
            for(int i=0;i<grid.length;i++){
                for(int j=0;j<grid[i].length;j++){
                    int temp = grid[i][j];
                    grid[i][j]=value;
                    value=temp;
                }
            }
            k-=1;
        }
        List<List<Integer>> answer = new ArrayList<>();
        for(int i=0;i<grid.length;i++){
            List<Integer> temp = new ArrayList<>();
            for(int j=0;j<grid[i].length;j++){
                temp.add(grid[i][j]);
            }
            answer.add(temp);
        }
        return answer;
    }
}