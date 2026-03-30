class Solution {
    public int scoreOfString(String s) {
        int sum = 0;
        for (int i = 0; i < s.length()-1; i++){
            int j = i+1;
            char c = s.charAt(i);
            char d = s.charAt(j);
            sum += Math.abs(c - d);
        }
        return sum;
    }
}