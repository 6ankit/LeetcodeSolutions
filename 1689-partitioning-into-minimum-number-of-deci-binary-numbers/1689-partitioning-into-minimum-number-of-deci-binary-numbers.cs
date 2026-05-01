public class Solution {
    public int MinPartitions(string n) {
        int ans =0;
        char[] ch =n.ToCharArray();
        for(int i=0;i<ch.Length;i++){
            ans=Math.Max(ch[i]-'0',ans);
        }
        return ans;
    }
}