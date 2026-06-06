class Solution {
    public int longestPalindrome(String s) {
        Map<Character,Integer> mp = new HashMap<>();
        char[] ch = s.toCharArray();
        for(int i=0;i<ch.length;i++){
            mp.put(ch[i],mp.getOrDefault(ch[i],0)+1);
        }
        int even  = 0;
        int odd = Integer.MIN_VALUE;

        for(Map.Entry<Character,Integer> m : mp.entrySet()){
            if(m.getValue()%2==0){
                even+=m.getValue();
            }
            else{
                odd=Math.max(odd,m.getValue());
            }
        }
        if(odd==Integer.MIN_VALUE) return even;
        int makeEven = 0;
        boolean flag = false;
        for(Map.Entry<Character,Integer> m:mp.entrySet()){
            if(m.getValue()%2!=0){
                if(m.getValue()==odd){
                    if(flag == true){
                        makeEven+=m.getValue()-1;
                    }else flag=true;
                }
                else{
                    makeEven+=m.getValue()-1;
                }
            }
        }
        makeEven+=odd;
        return even + makeEven;
    }
}