class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int count = 0;
        int n=A.length;
        int[] ans = new int[n];

        Set<Integer> set = new HashSet<>();
        for(int i=0;i<A.length;i++){
            int v1=A[i];
            int v2=B[i];

            if(set.contains(v1)) count+=1;
            if(set.contains(v2)) count+=1;
            if(v1==v2) count+=1;
            set.add(v1);
            set.add(v2);
            ans[i]=count;
        }


        return ans;
    }
}