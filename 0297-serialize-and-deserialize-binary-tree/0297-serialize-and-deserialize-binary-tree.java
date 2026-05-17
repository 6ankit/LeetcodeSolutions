/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    // int helpMe = 1;
    int index = 0;
    public TreeNode convertIntoTree(String[] arr)
    {
        String p=arr[index];
        if(p.equals("null")) 
        {
            index+=1;
            return null;
        }
        int val=Integer.parseInt(p);
        TreeNode root = new TreeNode(val);
        index+=1;
        root.left = convertIntoTree(arr);
        root.right = convertIntoTree(arr);
        return root;
    }
    StringBuilder temp = new StringBuilder();

    public void convertIntoString(TreeNode root)
    {
        if(root==null) 
        {
            temp.append("null"+" ");
            return ;
        }
        temp.append(root.val+" ");
        convertIntoString(root.left);
        convertIntoString(root.right);
        // return null;
    }
    public String serialize(TreeNode root) {
        convertIntoString(root);
        return temp.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] arr = data.split(" ");
        return convertIntoTree(arr);
        // return null;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));