class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
       
        Set<String> st = new HashSet<>();
        for(int i=0;i<obstacles.length;i++){
            st.add(obstacles[i][0]+" "+obstacles[i][1]);
        }
        int maxi=0; 
        char ch='N';
        int row =0;
        int col=0;
        for(int i=0;i<commands.length;i++){
            if(commands[i]==-1){
                if(ch=='N') ch='E';
                else if(ch=='E') ch='S';
                else if(ch=='S') ch='W';
                else ch='N';
            }
            else if(commands[i]==-2){
                if(ch=='N') ch='W';
                else if(ch=='W') ch='S';
                else if(ch=='S') ch='E';
                else ch='N';
            }
            else {
                int temp=commands[i];
                while(temp>0){
                    if(ch=='N') row+=1;
                    else if(ch=='S') row-=1;
                    else if(ch=='E') col+=1;
                    else col-=1;

                    if(st.contains(col+" "+row)){
                    if(ch=='N') row-=1;
                    else if(ch=='S') row+=1;
                    else if(ch=='E') col-=1;
                    else col+=1;
                    break;
                    }
                    int t=(row*row)+(col*col);
                    maxi=Math.max(t,maxi);
                    temp-=1;
                }
            }
        }
        return maxi;
    }
}