public class Solution {
    public bool IsGood(int[] nums) {
        int size=nums.Length;
        int maxi=int.MinValue;
        for(int i=0;i<size;i++)
        {
            maxi=Math.Max(nums[i],maxi);
        }
        // Console.WriteLine(maxi);
        Dictionary<int,int> mp=new Dictionary<int,int> ();
        for(int i=0;i<size;i++)
        {
            if(mp.ContainsKey(nums[i]))
            {
                mp[nums[i]]++;
            }
            else 
            {
                mp[nums[i]]=1;
            }
        }
        // List<int> ll=new List<int> ();
        int j=0;
        int[] arr=new int[maxi+1];
        for(int i=0;i<size;i++)
        {
            int k=mp[nums[i]];
            if(k==int.MinValue) continue ;
            if(nums[i]==maxi&&k!=2) return false;
            if(nums[i]!=maxi&&k!=1) return false;
            while(k>0)
            {
                arr[j]=nums[i];
                j+=1;
                k-=1;
            }
            mp[nums[i]]=int.MinValue;
        }
        Console.WriteLine(j);
        if(j!=maxi+1) return false;
        return true;
    }
}