/*
*   author Ankit lekharajani 6ankit
*   @param An integer value and a two dimension array representing the graph
*   @retrun An integer value representing the connected component in the graph
*/

class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
       List<List<Integer>> arr = new ArrayList<>();
       int answer = 0;

        for (int i = 0; i < n; i++) {
            arr.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
        arr.get(edge[0]).add(edge[1]);
        arr.get(edge[1]).add(edge[0]);
        }
        boolean[] visited = new boolean[n];

        for(int f=0;f<n;f++){
            if(visited[f]==false){
                Queue<Integer> q=new LinkedList<>();
                q.offer(f);
                List<Integer> help = new ArrayList<>();
                boolean flag = true;
                while(q.size()>0){
                    int node = q.peek();
                    visited[node]=true;
                    q.poll();
                    List<Integer> temp = new ArrayList<>();
                    temp.add(node);

                    for(int i=0;i<arr.get(node).size();i++){
                        int value = arr.get(node).get(i);
                        if(visited[value]==false){
                            q.offer(value);
                        }
                        visited[value]=true;
                        temp.add(value);
                    }

                    if(help.size()==0){
                        for(int i=0;i<temp.size();i++){
                            help.add(temp.get(i)); 
                        }
                    }
                    else{
                        if(help.size()!=temp.size()){
                            flag=false;
                        }
                        else{
                            Collections.sort(help);
                            Collections.sort(temp);
                            for(int i=0;i<help.size();i++){
                                if(help.get(i)!=temp.get(i)){
                                    flag=false;
                                }
                            }
                        }
                    }
                }
                if(flag==true){
                    answer+=1;
                }
            }   
        }

         
        return answer;
    }
}