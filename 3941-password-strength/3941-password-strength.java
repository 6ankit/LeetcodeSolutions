class Solution {
    public boolean isSmallChar(char ch){
        int p=(int)ch;
        if(p>=97 && p<=122){
            return true;
        }
        return false;
    }
    public boolean isCapChar(char ch){
        int p = (int)ch;
        if(p>=65 && p<=90){
            return true;
        }
        return false;
    }
    public boolean isDigit(char ch){
        int p=ch-'0';
        if(p>=0 && p<=9){
            return true;
        }
        return false;
    }
    public int passwordStrength(String password) {
       int[] caps=new int[26];
       int[] small=new int[26];
       int[] digit=new int[10];
       Set<Character> st = new HashSet<>();

       char[] ch = password.toCharArray();
       int answer = 0;
       for(int i=0;i<ch.length;i++){
            char c=ch[i];
            if(isSmallChar(c)){
                small[c-'a']++;
                if(small[c-'a']==1){
                    answer+=1;
                }
            }
            else if(isCapChar(c)){
                caps[c-'A']++;
                if(caps[c-'A']==1){
                    answer+=2;
                }
            }
            else if(isDigit(c)){
                digit[c-'0']++;
                if(digit[c-'0']==1){
                    answer+=3;
                }
            }
            else{
                if(!st.contains(c)){
                    answer+=5;
                }
                st.add(c);
                
            }
       }
       return answer;
    }
}