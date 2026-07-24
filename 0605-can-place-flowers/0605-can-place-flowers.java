class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n==0) return true;
        if(flowerbed.length == 1) {
            if(flowerbed[0]==0) {
                flowerbed[0]=1;
                n-=1;
            }
        }
        int i=1;
        if(flowerbed.length>=2 && flowerbed[0]==0 && flowerbed[1]==0){
            flowerbed[0]=1;
            n-=1;
        }
        while(n>0 && i<flowerbed.length-1){
        if(flowerbed[i]==0 && flowerbed[i+1]==0 && flowerbed[i-1]==0){
                flowerbed[i]=1;
                n-=1;
            }
            i+=1;
        }
        if(n==0) return true;
        if(flowerbed.length > 2 && flowerbed[flowerbed.length-1]==0 && flowerbed[flowerbed.length-2]==0){
            flowerbed[flowerbed.length-2]=1;
            n-=1;
        }
        if(n!=0) return false;
        return true;
    }
}