class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        

        int mini=Integer.MAX_VALUE;


        for(int i=0;i<landStartTime.length;i++){
            int s = landStartTime[i]+landDuration[i];

            for(int j=0;j<waterStartTime.length;j++){
                if(waterStartTime[j]>s){
                     int e=waterStartTime[j]+waterDuration[j];
                     mini=Math.min(mini,e);
                }
                else {
                    int e=s+waterDuration[j];
                     mini=Math.min(mini,e);
                }
            }
        }

        for(int i=0;i<waterStartTime.length;i++){
            int s = waterStartTime[i]+waterDuration[i];

            for(int j=0;j<landStartTime.length;j++){
                if(landStartTime[j]>s){
                     int e=landStartTime[j]+landDuration[j];
                     mini=Math.min(mini,e);
                }
                else{
                    int e=s+landDuration[j];
                    mini=Math.min(mini,e);
                }
            }
        }
        return mini;
    }
}