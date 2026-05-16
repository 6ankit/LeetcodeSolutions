class Solution {
public:
    int findMin(vector<int>& nums) {
        priority_queue<int> pq;
        for(int i=0;i<nums.size();i++)
        {
            pq.push(nums[i]);
        }
        while(pq.size()!=1)
        {
            pq.pop();
        }
        return pq.top();
    }
};