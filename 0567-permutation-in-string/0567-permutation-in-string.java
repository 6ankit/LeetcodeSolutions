class Solution {
    public boolean checkInclusion(String s1, String s2) {

        // adc
        // dcba
        
        char[] ch = s1.toCharArray();
        Arrays.sort(ch);
        s1=new String(ch);


        for(int i=0;i<=s2.length()-s1.length();i++){
            char[] c=s2.substring(i,s1.length()+i).toCharArray();
            Arrays.sort(c);
            if(s1.equals(new String(c))) return true;
        }
        return false;
    }
}