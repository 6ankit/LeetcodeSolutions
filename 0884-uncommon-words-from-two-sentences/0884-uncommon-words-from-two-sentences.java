class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {

       String[] first = s1.split(" ");
       String[] second = s2.split(" ");
       Map<String,Integer> mp1=new HashMap<>();
       Map<String,Integer> mp2 = new HashMap<>();

       for(int i=0;i<first.length;i++)
       {
        String s = first[i];
        mp1.put(s,mp1.getOrDefault(s,0)+1);
       }
       for(int i=0;i<second.length;i++)
       {
        String s = second[i];
        mp2.put(s,mp2.getOrDefault(s,0)+1);
       }
       int count =0;
       for(Map.Entry<String,Integer> m:mp1.entrySet())
       {
        if(!mp2.containsKey(m.getKey()) && m.getValue()==1) count+=1;
       }

       for(Map.Entry<String,Integer> m:mp2.entrySet())
       {
        if(!mp1.containsKey(m.getKey()) && m.getValue()==1) count+=1;
       }
       String[] answer = new String[count];
       int index=0;
       for(Map.Entry<String,Integer> m:mp1.entrySet())
       {
        if(!mp2.containsKey(m.getKey()) && m.getValue()==1)
        {
            answer[index]=m.getKey();
            index+=1;
        }
       }

       for(Map.Entry<String,Integer> m:mp2.entrySet())
       {
        if(!mp1.containsKey(m.getKey()) && m.getValue()==1)
        {
            answer[index]=m.getKey();
            index+=1;
        }
       }
       return answer; 
    }
}