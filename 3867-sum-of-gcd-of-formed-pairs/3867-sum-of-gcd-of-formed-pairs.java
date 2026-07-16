
class Solution {

    /*
    * author Ankit Lekharajani 6ankit
    * @param Two integer values
    * @return An integer Value
    */
    public int calculateGcd(int maxi,int element){
        while(element!=0){
            int rem = maxi%element;
            maxi=element;
            element=rem;
        }
        return maxi;
    }

    /*
    * author Ankit Lekharajani 6ankit
    * @param An integer static array
    * @return A long value
    */
    public long gcdSum(int[] nums) {
        
        int[] prefixGcd = new int[nums.length];

        int maxi = nums[0];

        for(int i=0;i<nums.length;i++){
            maxi=Math.max(maxi,nums[i]);
            prefixGcd[i]=calculateGcd(maxi,nums[i]);
        }
        Arrays.sort(prefixGcd);
        int i=0;
        int j=prefixGcd.length-1;
        long ans = 0;
        while(i<j){
            ans+=calculateGcd(prefixGcd[i],prefixGcd[j]);
            i+=1;
            j-=1;
        }
        return ans;
    }
}