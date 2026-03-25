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
    int ans =0;
    public int averageCompute(TreeNode root){
      if(root==null){
        return 0;
      }
     int leftValue= averageCompute(root.left);
     int rightValue = averageCompute(root.right);
     root.val=leftValue+rightValue+root.val;
     return root.val;

    }
    public int solve(TreeNode root,TreeNode head){
        if(root==null){
            return 0;
        }

        int leftCount = solve(root.left,head.left);
        int rightCount = solve(root.right,head.right);
        if(leftCount+rightCount==0){
            if(root.val/1==head.val)
            {
                ans+=1;
            }
        }
        else {
            int temp=leftCount+rightCount+1;
            if(root.val/temp==head.val) {
                ans+=1;
            }
        }
        return leftCount+rightCount+1;
    }
    public TreeNode getNewTree(TreeNode root){
        if(root==null){
            return null;
        }
        TreeNode head=new TreeNode(root.val);
        head.left=getNewTree(root.left);
        head.right=getNewTree(root.right);
        return head;
    }
    public int averageOfSubtree(TreeNode root) {
        TreeNode head=getNewTree(root);
        averageCompute(root);
        solve(root,head);
        return ans;
    }
}