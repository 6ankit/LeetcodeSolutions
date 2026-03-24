class Solution {
    public String gcdOfStrings(String str1, String str2) {
        StringBuilder ans = new StringBuilder();
        String answer = "";
        int i=0;
        while(i<str2.length()){
            char ch = str2.charAt(i);
            ans.append(ch);
            String temp="";
            while(temp.length()<str1.length()){
                temp+=ans.toString();
            }
            if(temp.length()>answer.length() && temp.equals(str1)){
                String p="";
                while(p.length()<str2.length()){
                    p+=ans.toString();
                }
                if(p.equals(str2))answer = ans.toString();
            }
            i+=1;
        }
        return answer;
    }
}