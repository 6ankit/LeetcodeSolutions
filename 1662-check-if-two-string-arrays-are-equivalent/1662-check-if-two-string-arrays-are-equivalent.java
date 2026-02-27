class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2)    {
        StringBuilder s1=new StringBuilder();
        for(int i=0;i<word1.length;i++){
            String p=word1[i];
            for(int j=0;j<p.length();j++){
                s1.append(p.charAt(j));
            }
        }
        StringBuilder s2=new StringBuilder();
        for(int i=0;i<word2.length;i++)
        {
            String p=word2[i];
            for(int j=0;j<p.length();j++)
            {
                s2.append(p.charAt(j));
            }
        }
        if(s1.toString().equals(s2.toString()))return true;
        return false;
    }
}