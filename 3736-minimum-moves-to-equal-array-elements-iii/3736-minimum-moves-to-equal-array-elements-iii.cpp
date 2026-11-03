class Solution {
public:
    int minMoves(vector<int>& nums) {
        
        int min=0;

        for(int i=0;i<nums.size();i++){
            min=max(min,nums[i]);
        }
        int ans = 0;
        for(int i=0;i<nums.size();i++){
            ans+=min-nums[i];
        }
        return ans;
    }
};