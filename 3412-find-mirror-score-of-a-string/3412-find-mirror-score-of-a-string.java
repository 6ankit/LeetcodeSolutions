class Pair{
    public int count;
    public List<Integer> idxs = new ArrayList<>();

    public Pair(int count,int idxs){
        this.count=count;
        this.idxs.add(idxs);
    }

}
class Solution {
    public long calculateScore(String s) {

      HashMap<Integer,Character> alpha = new HashMap<>();
      int temp =1;
      String x="abcdefghijklmnopqrstuvwxyz";
      for(int i=0;i<x.length();i++){
        alpha.put(temp,x.charAt(i));
        temp+=1;
      }

      HashMap<Character,Pair> mp = new HashMap<>();
      char[] ch = s.toCharArray();

      long answer =0;

      for(int i=0;i<ch.length;i++){

            int index = ch[i]-'a';
            index+=1;
            
            if(mp.containsKey(alpha.get(27-index))){

                Pair p = mp.get(alpha.get(27-index));

                List<Integer> help = p.idxs;
                int val=i-help.get(help.size()-1);
                answer+=val;
                p.count-=1;

                help.remove(help.size()-1);
                if(p.count==0){
                    mp.remove(alpha.get(27-index));
                }
                else mp.put(alpha.get(27-index), p); 
                continue;
            }

            if(!mp.containsKey(ch[i]))
            {
                Pair p = new Pair(1,i);
                mp.put(ch[i],p);
            }
            else{
                Pair p = mp.get(ch[i]);
                p.count=p.count+1;
                p.idxs.add(i);
            }
      }
     
      return answer;
    }
}