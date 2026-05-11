class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        
        int sum =0;
        int answer =0;
        for(int i=0;i<k;i++)
        {
            sum+=arr[i];
        }
        if(sum/k>=threshold) answer+=1;
        int i=k;
        int j=0;
        while(i<arr.length)
        {
            sum-=arr[j];
            sum+=arr[i];
            if(sum/k>=threshold) answer+=1;
            i+=1;
            j+=1;
        }
        return answer;
    }
}