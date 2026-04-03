class Solution {
    public int getLucky(String s, int k) {
        
        int converSion=0;
            char[] ch =s.toCharArray();
            StringBuilder temp = new StringBuilder();

            for(int i=0;i<ch.length;i++){
                int n=ch[i]-'a'+1;
                while(n>0){
                    temp.append(n%10);
                    n/=10;
                }
            }

            for(int j=0;j<temp.length();j++){
                converSion+=temp.charAt(j)-'0';
            }
            k-=1;
        while(k>0){
            int ans =converSion;
            int answer=0;
            while(ans>0){
                answer+=ans%10;
                ans/=10;
            }
            converSion=answer;
            k-=1;
        }
        return converSion;
}}