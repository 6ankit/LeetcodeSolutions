class Pair{
    private int index;
    private int val;

    Pair(int index,int val){
        this.index=index;
        this.val=val;
    }
    public int getIndex() {return this.index;}
    public int getVal(){return this.val;}
}
class Solution {
    public long findScore(int[] nums) {

        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->{
            if(a.getVal()==b.getVal()){
                return a.getIndex()-b.getIndex();
            }
            return a.getVal()-b.getVal();
        });

        for(int i=0;i<nums.length;i++)
        {
            Pair p = new Pair(i,nums[i]);
            pq.offer(p);
        }

        long answer =0;

        while(pq.size()>0)
        {
            Pair p = pq.peek();
            int index=p.getIndex();
            int val=p.getVal();
            if(nums[index]!=-1)
            {
                answer+=val;
                if(index-1>=0) nums[index-1]=-1;
                if(index+1<nums.length) nums[index+1]=-1;
                nums[index]=-1;
            }
            pq.poll();
        }
        return answer;
    }
}