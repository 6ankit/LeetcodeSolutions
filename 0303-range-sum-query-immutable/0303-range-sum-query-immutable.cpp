class NumArray {
public:
    vector<int> arr;
    NumArray(vector<int>& nums) {
        for(int i=0;i<nums.size();i++)
        {
           arr.push_back(nums[i]);
        }
        for(int i=1;i<arr.size();i++)
        {
            arr[i]=arr[i-1]+arr[i];
        }
    }
    
    int sumRange(int left, int right) {
        if(left==0) return arr[right];
      return arr[right]-arr[left-1];
    }
};

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray* obj = new NumArray(nums);
 * int param_1 = obj->sumRange(left,right);
 */