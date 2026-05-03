class Solution {
    public boolean rotateString(String s, String goal) {
        
        if(s.length()!=goal.length())
        {
            return false;
        }

        for(int i=s.length()-1;i>-1;i--)
        {
            StringBuilder temp = new StringBuilder(s.substring(i,s.length()));
            if(goal.equals(temp.toString()+s.substring(0,i)))
            {
                return true;
            }
        }
        return false;
    }
}