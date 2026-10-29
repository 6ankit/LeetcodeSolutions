class Solution {
public:
    void DFS( vector<vector<int>>&adj,vector<int> arr[],int &sum,int i,vector<bool>&visited)
    {
        visited[i]=true;
        for(int j=0;j<adj[i].size();j++)
        {
            int temp=adj[i][j];
            if(visited[temp]==false){
                sum+=1;
                DFS(adj,arr,sum,temp,visited);
            }
        }
    }
    long long countPairs(int n, vector<vector<int>>& edges) {
    vector<vector<int>> adj(n);
    for (auto& edge : edges) {
        int u = edge[0];
        int v = edge[1];
        adj[u].push_back(v);
        adj[v].push_back(u);
    }
    vector<int> answer;
    vector<bool> visited(n+1,false);
    vector<int> arr[n+1];
    for(int i=0;i<n;i++)
    {
        if(visited[i]==false){
            int sum=0;
            DFS(adj,arr,sum,i,visited);
            answer.push_back(sum+1);
        }
    }
    long long finalanswer=0;
    int k=0;
    for(int i=1;i<answer.size();i++)
    {
        answer[i]=answer[i]+answer[i-1];
    }
    if(answer.size()==1)
    {
        return 0;
    }
    k=1;
    int j=answer.size()-1;
    while(k<answer.size()-1){
        int main = answer[k]-answer[k-1];
        int second=answer[j]-answer[k];
        int third=main*second;
        finalanswer+=third;
        k+=1;
    }
    int last=answer[answer.size()-1]-answer[0];
    long long help = 1LL * last * answer[0];
    finalanswer+=help;
    return finalanswer;
    }
};