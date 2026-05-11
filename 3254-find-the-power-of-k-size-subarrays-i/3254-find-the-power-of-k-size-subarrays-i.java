class Solution {

    public boolean isArraySortedAndConsecutive(List<Integer> nums)
    {
        for(int i=0;i<nums.size()-1;i++)
        {
            if(nums.get(i)>=nums.get(i+1) || nums.get(i+1)!=nums.get(i)+1)
            {
                return false;
            }
        }
        return true;
    }
    public int getMaxi(List<Integer> nums)
    {
          int maxi=Integer.MIN_VALUE;
          for(int i=0;i<nums.size();i++)
          {
            maxi=Math.max(nums.get(i),maxi);
          }
          return maxi;
    }
    public int[] resultsArray(int[] nums, int k) {
        // 1 3 4 =>
        
      int[] result = new int[nums.length-k+1];
      List<Integer> temp = new ArrayList<>();
      int index=0;
      for(int i=0;i<k;i++)
      {
        temp.add(nums[i]);
      }
       if(isArraySortedAndConsecutive(temp))
        {
            result[index]=getMaxi(temp);
        }else result[0]=-1;
        temp.remove(0);
        index+=1;
      int t=k;
      while(t<nums.length)
      {
        temp.add(nums[t]);
        if(isArraySortedAndConsecutive(temp))
        {
            result[index]=getMaxi(temp);
        }
        else result[index]=-1;
        index+=1;
        temp.remove(0);
        t+=1;
      }
      return result;
    }
}