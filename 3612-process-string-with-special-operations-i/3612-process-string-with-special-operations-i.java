class Solution {
    public String processStr(String s) {
        StringBuilder answer = new StringBuilder();
        int i=0;
        char[] ch = s.toCharArray();
        while(i<ch.length){
            if(ch[i]=='*'){
                if(answer.length()>0){
                    answer.deleteCharAt(answer.length()-1);
                }
            }else if(ch[i]=='%'){
                answer.reverse();
            }else if(ch[i]=='#'){
                answer.append(answer);
            }else{
                answer.append(ch[i]);
            }
            i+=1;
        }
        return answer.toString();
    }
}