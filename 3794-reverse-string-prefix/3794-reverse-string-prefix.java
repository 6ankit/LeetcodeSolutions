class Solution {
    public String reversePrefix(String string, int k) {
        char[] ch = string.toCharArray();
        int s=0;
        int e=k-1;
        while(s<=e)
        {
            char temp =ch[s];
            ch[s]=ch[e];
            ch[e]=temp;
            s+=1;
            e-=1;
        }
        return new String(ch);
    }
}