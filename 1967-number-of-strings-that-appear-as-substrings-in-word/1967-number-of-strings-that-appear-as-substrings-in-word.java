class Solution {
    public int numOfStrings(String[] patterns, String word) {


        Set<String> subStrings = new HashSet<>();

        char[] ch = word.toCharArray();
        for(int i=0;i<ch.length;i++){
            String p = "";
            for(int j=i;j<ch.length;j++){
                p+=ch[j];
                subStrings.add(p);
            }
        }

        int ans = 0;

        for(int i=0;i<patterns.length;i++){
            if(subStrings.contains(patterns[i])) ans+=1;
        }
        return ans;
    }
}