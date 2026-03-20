class Solution {
    public int percentageLetter(String s, char letter) {
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==letter) count+=1;
        }
        double percentage = ((double)count/s.length())*100;
        int result = (int)Math.floor(percentage);
        return result;
    }
}