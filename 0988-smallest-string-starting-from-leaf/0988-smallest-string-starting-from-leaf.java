/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<List<Integer>> allPaths;
    List<Integer> paths;
    public void solve(TreeNode root){
        if(root==null){
            return ;
        }
        paths.add(root.val);
        if(root.left == null && root.right == null){
            allPaths.add(new ArrayList<>(paths));
        }
        solve(root.left);
        solve(root.right);
        paths.remove(paths.size()-1);
    }
    public String smallestFromLeaf(TreeNode root) {
        allPaths = new ArrayList<>();
        paths=new ArrayList<>();
        solve(root);
        Map<Integer,Character> alphas=new HashMap<>();
        String s="abcdefghijklmnopqrstuvwxyz";
        for(int i=0;i<=25;i++){
            alphas.put(i,s.charAt(i));
        }
        PriorityQueue<String> pq=new PriorityQueue<>();
        for(int i=0;i<allPaths.size();i++){
            StringBuilder sp=new StringBuilder();
            for(int j=allPaths.get(i).size()-1;j>=0;j--){
                sp.append(alphas.get(allPaths.get(i).get(j)));
            }
            pq.offer(sp.toString());
        }
        return pq.peek();
    }
}