class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        Set<String> st = new HashSet<>();

        for(int i=0;i<arr1.length;i++){
            String p = String.valueOf(arr1[i]);
            for(int j=0;j<p.length();j++){
               String t=p.substring(0,j+1);
               st.add(t);
            }
        }
        // System.out.println(st);

        int maxi=0;

        for(int i=0;i<arr2.length;i++){
            String p = String.valueOf(arr2[i]);
            if(st.contains(p.charAt(0)+"")) maxi=Math.max(maxi,1);
            for(int j=1;j<p.length();j++){
                if(st.contains(p.substring(0,j+1)))
                {
                    maxi=Math.max(maxi,j+1);
                }
                else break;
            }
        }
        return maxi;
    }
}