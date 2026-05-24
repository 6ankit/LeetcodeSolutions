class Solution {
    class Pair<T,U> {

        private T key;
        private U value;

        Pair(T key,U value){
            this.key=key;
            this.value=value;
        }
        public T getKey() {
            return this.key;
        }
        public U getValue(){
            return  this.value;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> mp = new HashMap<>();
        for(int n:nums){
            mp.put(n,mp.getOrDefault(n,0)+1);
        }   
        PriorityQueue<Pair<Integer,Integer>> pq= new PriorityQueue<>(
            (a,b)->{
                return b.getValue()-a.getValue();
            }
        );
        for(Map.Entry<Integer,Integer> m :mp.entrySet()){
            Pair<Integer,Integer> p=new Pair<>(m.getKey(),m.getValue());
            pq.offer(p);
        }
        int[] answer = new int[k];
        int index=0;
        while(k>0){
            System.out.println(pq.peek().getKey()+" "+pq.peek().getValue());
            answer[index]=pq.peek().getKey();
            index+=1;
            pq.poll();
            k-=1;
        }
        return answer;
    }
}