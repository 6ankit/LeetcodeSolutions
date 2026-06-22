class Solution {
    public int maxNumberOfBalloons(String text) {
        
       int b=0;
       int l=0;
       int a=0;
       int o=0;
       int n=0;

       for(int i=0;i<text.length();i++){
          char ch = text.charAt(i);
          if(ch=='b')b+=1;
          if(ch=='l')l+=1;
          if(ch=='a')a+=1;
          if(ch=='o')o+=1;
          if(ch=='n')n+=1;
       }

       int ans = Integer.MIN_VALUE;
       ans=Math.max(ans,b);

       l/=2;
       
       ans=Math.min(ans,l);
       ans=Math.min(ans,a);
       o/=2;
       ans=Math.min(ans,o);
       ans=Math.min(ans,n);
       return ans;
    }
}