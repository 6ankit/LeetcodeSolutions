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
    int ans=Integer.MIN_VALUE;
    public void solve(TreeNode root,int sum,char direction){
        if(root==null){
            ans=Math.max(ans,sum);
            return;
        }
        if(direction=='l'){
           if(root.right!=null) solve(root.right,sum+1,'r');
           else ans=Math.max(ans,sum);
           solve(root.left,1,'l');
        }
        else{
            if(root.left!=null) solve(root.left,sum+1,'l');
            else ans=Math.max(ans,sum);
            solve(root.right,1,'r');
        }
    }
    public int longestZigZag(TreeNode root) {
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 0;
        solve(root.left,1,'l');
        solve(root.right,1,'r');
        return ans;
    }
}