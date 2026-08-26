class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        
        int i=0;
        int j=0;
        int count = 0;
        Map<Integer,List<String>> mp = new HashMap<>();
         int smallest = Integer.MAX_VALUE;

        String ans = "";
        char[] ch = s.toCharArray();
        while(i<ch.length){
            if(ch[i]=='1'){
                count+=1;
            }
            while(j<ch.length && count==k){
                if(ch[j]=='1') count -=1;
               String p ="";
               for(int x=j;x<=i;x++){
                p+=ch[x];
               }
              int len = p.length();
              if(!mp.containsKey(len)){
                smallest=Math.min(smallest,len);
                List<String> a=new ArrayList<>();
                a.add(p);
                mp.put(len,a);
              }else mp.get(len).add(p);
               j+=1;
            }
            i+=1;
        }
        while(j<ch.length && count==k){
            String p ="";
            for(int x=j;x<=ch.length-1;x++){
                p+=ch[x];
               }
              int len = p.length();
              if(!mp.containsKey(len)){
                smallest=Math.min(smallest,len);
                List<String> a=new ArrayList<>();
                a.add(p);
                mp.put(len,a);
              }else mp.get(len).add(p);
               if(ch[j]=='1') count-=1;
               j+=1;
        }
        if(smallest==Integer.MAX_VALUE) return "";
        PriorityQueue<String> pq =new PriorityQueue<>(mp.get(smallest));
        return pq.peek();
    }
}