class ThroneInheritance {


    Map<String,List<String>> mp;
    Set<String> st;
    String king = "";
    public ThroneInheritance(String kingName) {
        mp=new HashMap<>();
        st=new HashSet<>();
        king=kingName;
    }
    
    public void birth(String parentName, String childName) {
        if(mp.containsKey(parentName)){
            mp.get(parentName).add(childName);
            if(!mp.containsKey(childName)){
                mp.put(childName,new ArrayList<>());
            }
            return ;
        }
        List<String> t=new ArrayList<>();
        t.add(childName); 
        mp.put(parentName,t);
        mp.put(childName,new ArrayList<>());
    }
    
    public void death(String name) {
        st.add(name);
    }
    
    public void dfs(String king,List<String> ans){
        if(!st.contains(king)){
            ans.add(king);
        }
        if(mp.get(king)!=null){
        List<String> p = mp.get(king);
        for(int i=0;i<p.size();i++){
            dfs(p.get(i),ans);
        }
        }
    }
    public List<String> getInheritanceOrder() {
        List<String> answer = new ArrayList<>();
        dfs(king,answer);
        return answer;
    }
}

/**
 * Your ThroneInheritance object will be instantiated and called as such:
 * ThroneInheritance obj = new ThroneInheritance(kingName);
 * obj.birth(parentName,childName);
 * obj.death(name);
 * List<String> param_3 = obj.getInheritanceOrder();
 */