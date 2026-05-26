class Solution {
    public int numberOfSpecialChars(String word) {
        int[] caps = new int[27];
        int[] small = new int[27];

        char[] ch = word.toCharArray();
        int answer = 0;
        for(int i=0;i<ch.length;i++){
            if(ch[i]>='a' && ch[i]<='z'){
                    int index = ch[i]-'a';
                    if(small[index]==0) small[index]+=1;
                    if(small[index]==1 && caps[index]==1){
                        answer+=1;
                        small[index]=Integer.MIN_VALUE;
                        caps[index]=Integer.MIN_VALUE;
                    }
            }
            else{
                    int index = ch[i]-'A';
                    if(caps[index]==0) caps[index]+=1;
                    if(small[index]==1 && caps[index]==1){
                        answer+=1;
                        small[index]=Integer.MIN_VALUE;
                        caps[index]=Integer.MIN_VALUE;
                    }
            }

            
        }
        return answer;
    }
}