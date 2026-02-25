class Solution {
    
    Map<String,Integer> firstMap;
    Map<String,Integer> secondMap;

    public int countWords(String[] words1, String[] words2) {
        firstMap=new HashMap<>();
        secondMap=new HashMap<>();
         
        for(String s:words1){
            firstMap.put(s,firstMap.getOrDefault(s,0)+1);
        }

        for(String s:words2){
            secondMap.put(s,secondMap.getOrDefault(s,0)+1);
        }
        int answer =0;
        for(String s:words1){
            if(firstMap.containsKey(s) && secondMap.containsKey(s))
            {
                if(firstMap.get(s)==1 && secondMap.get(s)==1)
                {
                    answer+=1;
                }
            }
        }
        return answer;
    }
}