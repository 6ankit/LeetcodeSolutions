class Pair{
    private int id;
    private char ch;

    public Pair(int id,char ch){
        this.id=id;
        this.ch=ch;
    }
    public int getId() {return this.id;}
    public char getChar(){return this.ch;}
}
class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> freq = new HashMap<>();
        for(char ch:s.toCharArray())
        {
            freq.put(ch,freq.getOrDefault(ch,0)+1);
        }

        Queue<Pair> pq = new PriorityQueue<>((a,b)->{
            return b.getId()-a.getId();
        });

        for(Map.Entry<Character,Integer> m:freq.entrySet()){
            Pair p = new Pair(m.getValue(),m.getKey());
            pq.offer(p);
        }

        StringBuilder answer = new StringBuilder();

        while(pq.size()>0){
            Pair p=pq.peek();
            int temp=p.getId();
            while(temp>0) {
                answer.append(p.getChar());
                temp-=1;
            }
            pq.poll();
        }
        return answer.toString();
    }
}