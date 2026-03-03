class Solution {
    public char findKthBit(int n, int k) {
        String s="0";
        for(int i=2;i<=n;i++)
        {
            StringBuilder ans = new StringBuilder();
            for(int j=0;j<s.length();j++)
            {
                if(s.charAt(j)=='1')ans.append('0');
                else ans.append('1');
            }
            s+='1';
            ans.reverse();
            s+=ans.toString();
        }
        System.out.println(s);
        return s.charAt(k-1);
    }
}