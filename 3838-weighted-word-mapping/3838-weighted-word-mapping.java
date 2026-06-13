class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
    
        char[] reverse = new char[26];
        String p="abcdefghijklmnopqrstuvwxyz";
        for(int i=p.length()-1;i>=0;i--){
            System.out.print(i+" ");
            reverse[26-(i+1)]=p.charAt(i);
        }
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<words.length;i++){
            char[] ch = words[i].toCharArray();
            int w=0;
            for(char c:ch){
                w+=weights[c-'a'];
            }
            ans.append(reverse[w%26]);
        }
        return ans.toString();
    }
}