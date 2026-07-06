class Solution {
    public int removeCoveredIntervals(int[][] intervals) {


        // 1 2 1 4 3 4
        
        int ans = intervals.length;
        for(int i=0;i<intervals.length;i++){
            int first = intervals[i][0];
            int second = intervals[i][1];
            if(first==Integer.MIN_VALUE && second== Integer.MIN_VALUE) continue;

            for(int j=0;j<intervals.length;j++){
                if(i==j) continue;
                int f = intervals[j][0];
                int s = intervals[j][1];

                if(f==Integer.MIN_VALUE) continue;

                if(f<=first && second<=s){
                    intervals[i][0]=Integer.MIN_VALUE;
                    intervals[i][1]=Integer.MIN_VALUE;
                    ans-=1;
                    break;
                }
            }
        }
        return ans;
    }
}