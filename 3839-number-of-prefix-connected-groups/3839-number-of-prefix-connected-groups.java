class Solution {
    public int prefixConnected(String[] words, int k) {

       Set<String> newlyAdded = new HashSet<>();
       Set<String> prev = new HashSet<>();
       int ans = 0;

       for(int i=0;i<words.length;i++){
            if(words[i].length()<k) continue;
            String s=words[i].substring(0,k);
            if(newlyAdded.contains(s)){
                if(!prev.contains(s)){
                    ans+=1;
                    prev.add(s);
                }
            }
            newlyAdded.add(s);
       }
       return ans;
    }
}