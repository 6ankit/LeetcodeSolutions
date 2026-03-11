class Solution {
    public int bitwiseComplement(int n) {
        String s=Integer.toBinaryString(n);
        StringBuilder temp = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0') temp.append('1');
            else temp.append('0');
        }
        return Integer.parseInt(temp.toString(),2);
    }
}