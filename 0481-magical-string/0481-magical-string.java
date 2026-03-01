class Solution {
     StringBuilder s= new StringBuilder("122");
    public void calculate(int i,int n)
    {
        if(s.length()>=n) return ;
        char ch = s.charAt(s.length()-1);
        char ithChar = s.charAt(i);
        if(ch=='1')
        {
            if(ithChar=='2'){
               if(s.length()<n) s.append('2');
               if(s.length()<n)s.append('2');
            }
            else {
                s.append('2');
            }
        }
        else if(ch=='2'){
            if(ithChar=='1'){
                s.append('1');
            }else{
                if(s.length()<n) s.append('1');
                if(s.length()<n) s.append('1');
            }
        }
       calculate(i+1,n);
    }
    public int magicalString(int n) {
   
        int i=2;
        calculate(i,n);
        System.out.println(s);
        int answer=0;
        for(int j=0;j<s.length();j++){
            if(s.charAt(j)=='1')answer+=1;
        }
        return answer;
    }
}