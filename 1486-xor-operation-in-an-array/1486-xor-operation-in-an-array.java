class Solution {
    public int xorOperation(int n, int start) {
        
        int[] arr = new int[n];
        int answer = 0;
        for(int i=0;i<n;i++){
            arr[i]=start+(2*i);
            if(i==0){
                answer = arr[i];
            }else{
                answer^=arr[i];
            }
        }
        return answer;
    }
}