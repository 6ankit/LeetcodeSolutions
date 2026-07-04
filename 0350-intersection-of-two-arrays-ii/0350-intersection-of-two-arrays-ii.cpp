class Solution {
public:
    vector<int> intersect(vector<int>& nums1, vector<int>& nums2) {
       sort(nums1.begin(),nums1.end());
       sort(nums2.begin(),nums2.end());
       int n=nums1.size();
       int n1=nums2.size();
       vector<int> st;
    //    st.push(-1);
       int i=0;
       int j=0;
       while(i<n&&j<n1)
       {
        if(nums1[i]<nums2[j]){
            ++i;
        }
        else if(nums1[i]>nums2[j])
        {
            ++j;
        }
        else 
        {
            st.push_back(nums1[i]);
            ++i;
            ++j;
        }
       }
       return st;
    }
};