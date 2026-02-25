class Solution {
    public boolean isLongPressedName(String n, String t) {
        if(t.length() < n.length()) return false;
        char[] name = n.toCharArray();
        char[] typed=t.toCharArray();
        //pyplrz
        //ppyypllr
        int i=0;
        int j=0;
        while(i<name.length && j<typed.length)
        {
           if(name[i]==typed[j])
           {
              char ch = name[i];
              int count =0;
              int count2=0;
              while(i<name.length && name[i]==ch)
              {
                i+=1;
                count+=1;
              }
              while(j<typed.length && typed[j]==ch)
              {
                j+=1;
                count2+=1;
              }
              if(count>count2) return false;
           }
           else return false;
        }
        if(i>=name.length && j<typed.length || i<name.length && j>=typed.length ) return false;
        return true;
    }
}