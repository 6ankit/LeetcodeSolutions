class Solution {
public:
    int findMin(vector<int>& nums) {
        int target=INT_MAX;
        for(int i=0;i<nums.size();i++){
            if(nums[i]<target)
            {
                target=nums[i];
            }
        }
        return target;
    }
};