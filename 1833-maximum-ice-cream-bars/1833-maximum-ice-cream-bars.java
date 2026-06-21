class Solution {
    public int maxIceCream(int[] costs, int coins) {
            Arrays.sort(costs);
            int ans = 0;
            int i=0;
            // 1 1 2 3 4 
            while(i<costs.length && coins>=costs[i]){
                coins-=costs[i];
                i+=1;
                ans+=1;
            }
            return ans;
    }
}