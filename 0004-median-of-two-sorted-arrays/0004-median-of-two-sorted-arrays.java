class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        

        int n=nums1.length;
        int m=nums2.length;

        int i=0;
        int j=0;

        int[] newArr = new int[n+m];
        int index=0;
        while(i<n && j<m)
        {
            if(nums1[i]<nums2[j]){
                newArr[index]=nums1[i];
                i+=1;
            }else
            {
                newArr[index]=nums2[j];
                j+=1;
            }
            index+=1;
        }
        while(i<n){
             newArr[index]=nums1[i];
             i+=1;
             index+=1;
        }
        while(j<m){
             newArr[index]=nums2[j];
             j+=1;
             index+=1;
        }
        if(newArr.length%2==0){
            int mid = newArr.length/2;
            return (double)(newArr[mid]+newArr[mid-1])/2;
        }
        return (double)newArr[newArr.length/2];
    }
}