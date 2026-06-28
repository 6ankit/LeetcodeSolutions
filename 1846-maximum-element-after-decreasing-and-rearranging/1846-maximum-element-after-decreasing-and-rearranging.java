class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        

        Arrays.sort(arr);
        if(arr[0]!=1) arr[0]=1;
        int maxi = arr[0];

        for(int i=1;i<arr.length;i++){
             if(arr[i]-arr[i-1]>=2) arr[i]=arr[i-1]+1;
             maxi=Math.max(maxi,arr[i]);
        }
        return maxi;
    }
}