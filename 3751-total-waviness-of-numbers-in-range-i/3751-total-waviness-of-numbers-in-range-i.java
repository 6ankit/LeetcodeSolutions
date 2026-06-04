class Solution {
    public int totalWaviness(int num1, int num2) {
        

        int ans = 0;
        for(int i=num1;i<=num2;i++){
            int temp = i;
            StringBuilder help = new StringBuilder();
            while(temp>0){
                help.append(temp%10);
                temp/=10;
            }

            help.reverse();
            if(help.length()<3) continue;
            for(int j=1;j<help.length()-1;j++){
                int first = help.charAt(j-1)-'0';
                int middle = help.charAt(j)-'0';
                int last = help.charAt(j+1)-'0';

                if(middle>first && middle>last){
                    ans+=1;
                }else if(middle<first && middle<last){
                    ans+=1;
                }
            }
        }
        return ans;
    }
}