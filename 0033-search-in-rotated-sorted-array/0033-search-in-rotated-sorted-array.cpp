class Solution {
public:
    int search(vector<int>& nums, int target) {
        int s=0;
        int e=nums.size()-1;
        int counter=-1;
        for(int i=0;i<=e;i++)
        {
            if(nums[i]==target)
            {
                counter=i;
                break;
            }
            else 
            {
                continue ;
            }
        }
        if(counter==-1)
        {
            return counter;
        }
        int mid;
        while(s<=e)
        {
            mid=(s+e)/2;
            if(nums[mid]==target)
            {
                counter = mid;
                break;
            }
            else if(mid>counter)
            {
                e=mid-1;
            }
            else 
            {
                s=mid+1;
            }
        }
        return counter;
    }
};