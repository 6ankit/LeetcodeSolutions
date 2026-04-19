class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        for(int i=0;i<matrix.length;i++){
          for(int j=0;j<matrix[i].length;j++){
            
           int[] arr =matrix[i];

            int s = 0;
            int e=arr.length-1;
            while(s<=e){
                int mid = (s+e)/2;
                if(arr[mid]==target){
                    return true;
                }
                else if(arr[mid]>target){
                    e=mid-1;
                }else s=mid+1;
            }
          }
            
        }
        return false;
    }
}