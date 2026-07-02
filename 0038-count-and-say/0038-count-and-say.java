class Solution {
    public StringBuilder generate(StringBuilder s){
        StringBuilder answer = new StringBuilder();
        char bh=s.charAt(0);
        int count = 1;

        if(s.length()==1){
            answer.append("1");
            answer.append("1");
            return answer;
        }

        for(int i=1;i<s.length();i++){
             if(bh==s.charAt(i)){
                count+=1;
             }else{
                answer.append(count);
                answer.append(bh);
                bh=s.charAt(i);
                count=1;
             }
        }
        answer.append(count);
        answer.append(bh);
        return answer;
    }
    public String countAndSay(int n) {
        StringBuilder s=new StringBuilder("1");
        for(int i=2;i<=n;i++){
            s=generate(s);
        }
        return s.toString();
    }
}