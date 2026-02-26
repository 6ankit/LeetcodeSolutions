class Solution {
    public boolean isVowel(char ch)
    {
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')return true;
        return false;
    }
    public int maxVowels(String s, int k) {
        int maxi = Integer.MIN_VALUE;
        int count =0;
        for(int i=0;i<k;i++)
        {
            if(isVowel(s.charAt(i))) count+=1;
        }
        maxi=Math.max(count,maxi);
        int j=k;
        int i=0;
        while(j<s.length())
        {
            if(isVowel(s.charAt(i)))count-=1;
            if(isVowel(s.charAt(j)))count+=1;
            maxi=Math.max(count,maxi);
            j+=1;
            i+=1;
        }
         maxi=Math.max(count,maxi);
        return maxi;
    }
}