class Solution {
    String ans = "";

    public void generateStrings(StringBuilder temp,Set<String> st,int size)
    {
        if(temp.length()>=size){
            if(!st.contains(temp.toString()) && temp.length()==size)
            {
            ans=temp.toString();
            }
            return ;
        }
        

        temp.append('0');
        generateStrings(temp,st,size);
        temp.deleteCharAt(temp.length()-1);
        temp.append('1');
        generateStrings(temp,st,size);
        temp.deleteCharAt(temp.length()-1);
    }

    public String findDifferentBinaryString(String[] nums) {
        Set<String> st = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            st.add(nums[i]);
        }

        int size = nums[0].length();
        generateStrings(new StringBuilder(), st, size);
        return ans;
    }
}