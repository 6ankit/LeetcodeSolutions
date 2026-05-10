class Solution {
    // arr.length = 7
    public boolean canJump(int[] arr,int start,int index,boolean[] visited)
    {
        if(index>=arr.length || index<0)
        {
            return false;
        }
        if(visited[index]==true)
        {
            return false;
        }
        visited[index]=true;
        if(arr[index]==0)
        {
            return true;
        }

        return canJump(arr,start,arr[index]+index,visited) || canJump(arr,start,index-arr[index],visited);
        
    }
    public boolean canReach(int[] arr, int start) {
        boolean[] visited=new boolean[arr.length];
        return canJump(arr,start,start,visited);
    }
}