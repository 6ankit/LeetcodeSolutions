class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int maxi=0;
        int count =1;
        int i=0;
        while(i<citations.length){
            for(int j=0;j<citations.length;j++){
                if(citations[j]>=count){
                    if(citations.length-j<count)return maxi;
                    maxi=count;
                    break;
                    // 0 1 3 5 6 
                }
            }
            count+=1;
            i+=1;
        }
        return maxi;
    }
}