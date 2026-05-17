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
    public TreeNode solveWithLow(TreeNode root,int high,int low)
    {
        if(root==null) return null;

        if(root.val<low)
        {
            TreeNode f = solveWithLow(root.right,high,low);
            root.right = f;
            return f;
        }
        else if(root.val>high){
            TreeNode f = solveWithLow(root.left,high,low);
            return f;
        }
       
        TreeNode f = solveWithLow(root.left,high,low);
        root.left=f;
        TreeNode s=solveWithLow(root.right,high,low);
        root.right=s;
        
        return root;
    }
    public TreeNode solveWithHigh(TreeNode root,int high,int low)
    {
        if(root==null) return null;

        TreeNode first = solveWithHigh(root.left,high,low);
        root.left = first;
        TreeNode second = solveWithHigh(root.right,high,low);
        root.right = second;

        if(root.val>high)
        {
            return root.left;
        }
        else if(root.val<low)
        {
            return root.right;
        }
        return root;
    }
    public TreeNode trimBST(TreeNode root, int low, int high) {
        root.right = solveWithHigh(root.right,high,low);
        root.left = solveWithLow(root.left,high,low);
        if(root.val<low) return root.right;
        if(root.val>high) return root.left;
        return root;
    }
}