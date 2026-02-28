class Solution {
    public int pivotInteger(int n) {
        if(n==1 || n==0) return n;
        int[] arr = new int[n];
        arr[0]=1;
        for(int i=1;i<n;i++) arr[i]=arr[i-1]+(i+1); 
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]==arr[arr.length-1]-arr[i-1]) return i+1;
        }
    // 1 , 3,6 10 , 15. 21, 28 , 36
        return -1;
    }
}