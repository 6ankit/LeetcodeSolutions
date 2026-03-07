class Solution {
    public boolean containsPattern(int[] arr, int m, int l) {
        for(int j=0;j<=arr.length-m;j++){
            List<Integer> temp = new ArrayList<>();
            int k=j;
            while(k<=m+j-1){
                temp.add(arr[k]);
                k+=1;
            }
            int x=j;
            int c=l-1;
            while(c>0){
                k=x+m;
                int v=m;
                List<Integer> temp2 = new ArrayList<>();
                while(k<arr.length && v>0){
                    temp2.add(arr[k]);
                    k+=1;
                    v-=1;
                }
                if(temp2.size()<m) break;
                for(int b=0;b<temp2.size();b++){
                    if(temp2.get(b)!=temp.get(b)){
                        c=Integer.MIN_VALUE;
                        break;
                    }
                }
                if(c==Integer.MIN_VALUE){
                    break;
                }
                c-=1;
                x=x+m;
                if(c==0) return true;
            }
        }
        return false;
    }

}