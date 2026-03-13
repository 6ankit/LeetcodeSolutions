class Solution {
    public int secondHighest(String s) {
        int firstMax=-1;
        int secondMax=-1;

        char[] ch = s.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]>='a' && ch[i]<='z'){
                continue;
            }
            else {
                int temp = ch[i]-'0';
                System.out.println(ch[i]);
                if(temp>firstMax){
                    secondMax=firstMax;
                    firstMax=temp;
                }
                else if(temp>secondMax){
                 if(firstMax!=temp) secondMax=temp;
                }
            }
        }
        return secondMax;
    }
}