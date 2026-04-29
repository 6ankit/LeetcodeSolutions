public class Solution {
    public int[] Decrypt(int[] code, int k) {
       
       int n=code.Length;
       for(int i=1;i<n;i++){
        code[i]=code[i]+code[i-1];
       }
       int[] answer = new int[n];

       if(k==0){
        for(int i=0;i<n;i++){
            answer[i]=0;
        }
       }
       else if(k>0){
        for(int i=0;i<n;i++)
        {
            if(k+i<n){
                answer[i]=code[k+i]-code[i];
            }else{ 
                int lastVal = code[n-1]-code[i];
                int remIndex=n-i-1;
                remIndex=k-remIndex;
                answer[i]=lastVal+code[remIndex-1];
            }
        }
       } 
       else{
        k=Math.Abs(k);
        for(int i=0;i<n;i++)
        {
            if(i-k<0)
            {
                if(i-1<0){
                    int temp = code[n-1]-code[n-k-1];
                    answer[i]=temp;
                }else{
                    int rem = k-i;
                    int temp = code[n-1]-code[n-rem-1];
                    answer[i]=code[i-1]+temp;
                }
            }else{
               if(i-k==0) answer[i]=code[i-1];
               else{
                answer[i]=code[i-1]-code[i-k-1];
               }
            }
        }
       }
       return answer;
    }
}