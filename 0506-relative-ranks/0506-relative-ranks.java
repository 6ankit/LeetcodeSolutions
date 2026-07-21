class Solution {
    public String[] findRelativeRanks(int[] score) {
        
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<score.length;i++){
            mp.put(score[i],i);
        }
        Arrays.sort(score);
        String[] answer = new String[score.length];

        for(int i=0;i<score.length;i++){
            if(i==score.length-1){
                answer[mp.get(score[i])] = "Gold Medal";
            }
            else if(i==score.length-2){
                answer[mp.get(score[i])] = "Silver Medal";
            }
            else if(i==score.length-3){
                answer[mp.get(score[i])] = "Bronze Medal";
            }
            else{
                answer[mp.get(score[i])] = score.length-i+"";
            }
        }
        return answer;
    }
}