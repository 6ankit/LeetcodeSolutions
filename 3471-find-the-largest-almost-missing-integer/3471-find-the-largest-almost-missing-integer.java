class Solution {
    public int largestInteger(int[] nums, int k) {
        int[] arr = new int[50+1];
        Set<Integer> st = new HashSet<>();
        for(int i=0;i<k;i++){
            st.add(nums[i]);
        }
        for(Integer l:st){
            arr[l]+=1;
        }
        int i=1;
        int j=k;
        while(j<nums.length){
            Set<Integer> set = new HashSet<>();
            for(int p=i;p<=j;p++){
                set.add(nums[p]);
            }
            for(Integer l:set){
                arr[l]+=1;
            }
            j+=1;
            i+=1;
        }
        int count = 0;
        int answer = -1;
        for(int x=0;x<arr.length;x++){
            if(arr[x]>0){
                if(count == 0){
                    if(arr[x]==1){
                    answer=x;
                    count = arr[x];
                    }
                }
                else if(count>arr[x]){
                    if(arr[x]==1){
                    answer=x;
                    count = arr[x];
                    }
                }
                else if(count==arr[x]){
                    if(arr[x]==1){
                    answer = Math.max(x,answer);
                    }
                }
            }
        }
        return answer;
    }
}