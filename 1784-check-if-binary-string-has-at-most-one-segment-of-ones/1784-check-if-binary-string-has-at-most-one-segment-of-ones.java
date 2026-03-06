class Solution {
    public boolean checkOnesSegment(String s) {
       int flagg=1;
       int count =0;
       for(int i=1;i<s.length();i++){
          if(s.charAt(i)=='1'){
            if(count >0) return false;
          }
          else {
            count+=1;
          }
       }
       return true;
    }
}