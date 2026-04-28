class Solution {
    public int minOperations(int[][] grid, int x) {
        int minSteps =0;

        List<Integer> arr = new ArrayList<>();

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                int val = grid[i][j];
                arr.add(val);
            }
        }
        Collections.sort(arr);
        // 1 2 3 5
        // 2 4 6 8 

        for(int i=0;i<arr.size();i++){
            int val = arr.get(i);
            int steps =0;
            int mid = arr.get(arr.size()/2);

            if(mid>val){
                while(mid>val){
                    mid-=x;
                    steps+=1;
                }
                if(mid<val) return -1;
                minSteps = minSteps+steps;
            }else{
                while(mid<val){
                    mid+=x;
                    steps+=1;
                }
                if(mid>val) return -1;
                minSteps = minSteps+steps;
            }
             // 2 4 6 8 
        }
        return minSteps;
    }
}