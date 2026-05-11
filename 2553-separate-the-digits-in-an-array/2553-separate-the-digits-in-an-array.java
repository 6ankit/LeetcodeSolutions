class Solution {
    
    public int[] separateDigits(int[] nums) {
        
        List<Integer> temp= new ArrayList<>();

        for(int i=0;i<nums.length;i++)
        {
            int element = nums[i];
            List<Integer> temp2=new ArrayList<>();
            while(element>0)
            {
                temp2.add(element%10);
                element/=10;
            }
            Collections.reverse(temp2);
            for(Integer v:temp2) temp.add(v);
        }
        int[] answer = new int[temp.size()];
        for(int i=0;i<temp.size();i++)
        {
           answer[i]=temp.get(i);
        }
        return answer;
    }
}