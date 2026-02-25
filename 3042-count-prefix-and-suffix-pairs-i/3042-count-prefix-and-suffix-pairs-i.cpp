class Solution {
public:
    int countPrefixSuffixPairs(vector<string>& arr) 
    {
        int ans=0;
   for(int i=0;i<arr.size()-1;i++)
   {
    string p="";
    p+=arr[i];
    for(int j=i+1;j<arr.size();j++)
    {
        string s="";
        s+=arr[j];
       if(p.size()<s.size())
       {
        string prefix=s.substr(0,p.size());
        int size=s.size()-p.size();
        string suffix=s.substr(size,s.size());
        if(suffix==p&&prefix==p) ans+=1;
       }
       else if(p.size()==s.size())
       {
        if(p==s) ans+=1;
       }
   }
}
return ans;
    }
};