class Solution {

    public String getBitRepresentation(int value,Function<Integer,String> function){
        return function.apply(value);
    }


    public int hammingDistance(int x, int y) {
        
        String first = getBitRepresentation(x,(num)->{
            StringBuilder answer = new StringBuilder();
            while(num>0){
                answer.append(num%2);
                num/=2;
            }
            return answer.reverse().toString();
        });

        String second = getBitRepresentation(y,(num)->{
            StringBuilder answer = new StringBuilder();
            while(num>0){
                answer.append(num%2);
                num/=2;
            }
            return answer.reverse().toString();
        });

        if(first.length()<second.length()){
            StringBuilder p = new StringBuilder();
            int k=second.length()-first.length();
            while(k>0){
                p.append('0');
                k-=1;
            }
            p.append(first);
            first=p.toString();
        }
        if(first.length()>second.length()){
            StringBuilder p = new StringBuilder();
            int k=first.length()-second.length();
            while(k>0){
                p.append('0');
                k-=1;
            }
            p.append(second);
            second=p.toString();
        }

        int ans = 0;
        int i=first.length()-1;
        int j=second.length()-1;
        while(i>=0 && j>=0){
            if(first.charAt(i)!=second.charAt(j)){
                ans+=1;
            }
            i-=1;
            j-=1;
        }
        return ans;
    }
}