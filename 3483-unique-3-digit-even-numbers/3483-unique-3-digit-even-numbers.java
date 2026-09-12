class Solution {
    public int totalNumbers(int[] digits) {
        
        int ans = 0;
        Set<String> arr = new HashSet<>();
        for(int i=0;i<digits.length;i++){
            for(int j=0;j<digits.length;j++){
                if(i!=j){
                for(int k=0;k<digits.length;k++){
                   if(k!=i && k!=j) arr.add(digits[i]+""+digits[j]+""+digits[k]);
                }
                }
            }
        }
        Iterator<String> it = arr.iterator();
        while(it.hasNext()){
            String p = it.next();
            if(p.charAt(0)!='0'){
                if(Integer.valueOf(p)%2==0) ans+=1;
            }
        }
        return ans;
    }
}