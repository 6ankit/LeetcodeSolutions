class Solution {
    public boolean checkString(String s) {
        int countA=0;
        int countB=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                if(countB>0)return false;
            }
            else {
                countB+=1;
            }
        }
        return true;
    }
}