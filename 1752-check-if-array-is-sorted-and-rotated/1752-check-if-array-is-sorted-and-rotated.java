class Solution {
    public boolean check(int[] nums) {

        int index = -1;
        int i=0;
        while(i<nums.length-1){
            if(nums[i]>nums[i+1]){
                index=i+1;
                break;
            }
            i+=1;
        }
        if(index==-1) return true;
        List<Integer> arr = new ArrayList<>();
        int temp = index;
        while(index<nums.length){
            arr.add(nums[index++]);
        }
        i=0;
        while(i<temp){
            arr.add(nums[i++]);
        }

        for(int j=0;j<arr.size()-1;j++){
            if(arr.get(j)>arr.get(j+1)){
                return false;
            }
        }
        return true;

        
    }
}