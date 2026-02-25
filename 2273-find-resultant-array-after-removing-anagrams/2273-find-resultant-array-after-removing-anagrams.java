class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> answer = new ArrayList<>();
        answer.add(words[0]);
        for(int i=1;i<words.length;i++){
            char[] ch = answer.get(answer.size()-1).toCharArray();
            char[] bh=words[i].toCharArray();
            Arrays.sort(ch);
            Arrays.sort(bh);
            String pb = new String(ch);
            String cb = new String(bh);
            if(!pb.equals(cb)){
                answer.add(words[i]);
            }
        }
        return answer;
    }
}