class Solution {
    public int getLeastFrequentDigit(int n) {
        int[] freq=new int[10];

        while(n>0){
            freq[n%10]++;
            n/=10;
        }
        int frequency = Integer.MAX_VALUE;
        int ele=0;
        for(int i=0;i<10;i++){
           if(freq[i]>0 && frequency>freq[i]){
            frequency=freq[i];
            ele=i;
           }
        }
        return ele;
    }
}