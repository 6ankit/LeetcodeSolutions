class Solution {
    public String majorityFrequencyGroup(String s) {
        Map<Character,Integer> mp = new HashMap<>();
        char[] ch = s.toCharArray();
        for(int i=0;i<ch.length;i++){
            mp.put(ch[i],mp.getOrDefault(ch[i],0)+1);
        }
        Map<Integer,List<Character>> mp1=new HashMap<>();
        Iterator<Map.Entry<Character,Integer>> it = mp.entrySet().iterator();
        String answer = "";
        int maxi=Integer.MIN_VALUE;
        int freq=0;
        while(it.hasNext()){
            Map.Entry<Character,Integer> m= it.next();
            if(!mp1.containsKey(m.getValue())){
                List<Character> l=new ArrayList<>();
                l.add(m.getKey());
                mp1.put(m.getValue(),l);
            }
            else {
                List<Character> l=mp1.get(m.getValue());
                l.add(m.getKey());
                mp1.put(m.getValue(),l);
            }
            if(maxi<mp1.get(m.getValue()).size()){
                maxi=mp1.get(m.getValue()).size();
                List<Character> tt=mp1.get(m.getValue());
                answer ="";
                for(int v=0;v<tt.size();v++) {
                        answer+=tt.get(v);
                }
                freq=m.getValue();
            }
            else if(maxi==mp1.get(m.getValue()).size()){
                if(freq<m.getValue()){
                List<Character> tt=mp1.get(m.getValue());
                answer ="";
                for(int v=0;v<tt.size();v++) {
                        answer+=tt.get(v);
                }
                freq=m.getValue();
                }
            }
        }
        return answer;
    }
}