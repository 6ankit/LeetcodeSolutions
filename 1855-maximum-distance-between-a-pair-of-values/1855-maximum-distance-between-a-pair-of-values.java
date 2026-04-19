class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        
        int maxDistance = Integer.MIN_VALUE;

        for(int i=0;i<nums1.length;i++){
            int distance = binarySearch(nums1[i],i,nums2);
            maxDistance = Math.max(maxDistance,distance-i);
        }
        return maxDistance;

    }

    public int binarySearch(int val,int start,int[] nums2){
        int low = start;
        int ans =0;
        int high = nums2.length;

        while(low<high){
            int mid = low + (high-low)/2;
            if(nums2[mid]>=val){
                ans = mid;
                low=mid+1;
            }
            else{
                high=mid;
            }
        }
        return ans;
    }
}