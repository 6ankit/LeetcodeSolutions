class Solution {
    public void findDefect(Set<Integer> defect,int n,int node,int k,boolean flag,boolean[] visited,Map<Integer,List<Integer>> mp){
        if(node>=n){
            return ;
        }
        if(flag==true){
            defect.add(node);
        }
        if(visited[node]==true) return;
        visited[node]=true;
        if(!mp.containsKey(node)) return ;
        List<Integer> temp = mp.get(node);
        for(int i=0;i<temp.size();i++){
            int val=temp.get(i);
            if(val==k){
                flag=true;
            }
            findDefect(defect,n,val,k,flag,visited,mp);
        }

    }
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        if(invocations.length==0){
            List<Integer> ans = new ArrayList<>();
            for(int i=0;i<n;i++){
                if(k!=i){
                    ans.add(i);
                }
            }
            return ans;
        }
        
        Map<Integer,List<Integer>> mp = new HashMap<>();
        for(int i=0;i<invocations.length;i++){
            int first = invocations[i][0];
            int second = invocations[i][1];

            if(mp.containsKey(first)){
                mp.get(first).add(second);
            }
            else{
                List<Integer> arr=new ArrayList<>();
                arr.add(second);
                mp.put(first,arr);
            }
        }
        
        Set<Integer> defect = new HashSet<>();
        Set<Integer> p=new HashSet<>();
        boolean flag = false;
        boolean[] visited = new boolean[n];
            flag=true;
             findDefect(defect,n,k,k,flag,visited,mp);
           
        
        boolean f=false;
        for(int i=0;i<n;i++){
            if(!mp.containsKey(i)){
                if(!defect.contains(i)){
                    p.add(i);
                    continue;
                }
                continue;
            }
            List<Integer> temp = mp.get(i);
            if(!defect.contains(i)){
                p.add(i);
                for(int j=0;j<temp.size();j++){
                    if(!defect.contains(temp.get(j))){
                        p.add(temp.get(j));
                    }
                    else {
                        f=true;
                        break;
                    }
                }
            }
            if(f==true) break;
        }
        if(f==true){
            List<Integer> ans = new ArrayList<>();
            for(int i=0;i<n;i++){
                ans.add(i);
            }
            return ans;
        }
        return p.stream().toList();
    }
}