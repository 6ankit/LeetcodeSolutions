class Solution {
    public List<Integer> getSelfDivingNumber(int left,int right)
    {
        List<Integer> answer =  new ArrayList<>();
        for(int i=left;i<=right;i++)
        {
            int temp = i;
            boolean flag=true;
            while(temp>0){
                if(temp%10==0 || i%(temp%10)!=0) {
                    flag=false;
                    break;
                }
                temp/=10;
            }
            if(flag==true) answer.add(i);
        }
        return answer;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        return getSelfDivingNumber(left,right);
    }
}