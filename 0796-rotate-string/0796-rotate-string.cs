public class Solution {
    public bool RotateString(string s, string goal) {
        for(int i=s.Length-1;i>-1;i--)
        {
            if(goal.Equals(s.Substring(i,s.Length-i)+s.Substring(0,i)))
            {
                return true;
            }
        }
        return false;
    }
}