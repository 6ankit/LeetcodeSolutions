class Solution {
    public int minFlips(int[][] grid) {
        // 1 0
        

        // int answer = 0;
        int fmini=0;
        int smini=0;
        System.out.print("row "+grid.length+" "+"col "+grid[0].length);

        for(int i=grid[0].length-1;i>=0;i--){
            int temp = 0;
            int temp2 = grid.length-1;
            List<Integer> t=new ArrayList<>();
            while(temp2>=0){
                t.add(grid[temp2][i]);
                temp2-=1;
            }
            
            temp=0;
            temp2=t.size()-1;
            while(temp<=temp2){
                if(t.get(temp)!=t.get(temp2)){
                    fmini+=1;
                }
                temp+=1;
                temp2-=1;
            }
        }

        for(int i=0;i<grid.length;i++){
            int[] t= grid[i];
            int temp = 0;
            int temp2=t.length-1;
            while(temp<=temp2){
                if(t[temp]!=t[temp2]){
                    smini+=1;
                }
                temp+=1;
                temp2-=1;
            }
        }
        // if(answer==0) return 0;
        return Math.min(smini,fmini);
    }
}