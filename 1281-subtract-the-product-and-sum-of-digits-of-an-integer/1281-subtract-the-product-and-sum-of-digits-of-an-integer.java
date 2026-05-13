class Solution {
    public int getTheProduct(int n)
    {
        int temp = 1;
        while(n>0)
        {
            temp*=n%10;
            n/=10;
        }
        return temp;
    }
    public int getTheSum(int n)
    {
        int temp =0;
        while(n>0)
        {
            temp+=n%10;
            n/=10;
        }
        return temp;
    }
    public int subtractProductAndSum(int n) {
        return getTheProduct(n)-getTheSum(n);
    }
}