class Solution {
    public int digitFrequencyScore(int n) {
        Map<Integer,Integer> mp = new HashMap<>();
        while(n>0){
            mp.put(n%10,mp.getOrDefault(n%10,0)+1);
            n/=10;
        }
        int answer = 0;
        for(Map.Entry<Integer,Integer> m :mp.entrySet()){
            int t=m.getKey()*m.getValue();
            answer+=t;
        }
        return answer;
    }
}