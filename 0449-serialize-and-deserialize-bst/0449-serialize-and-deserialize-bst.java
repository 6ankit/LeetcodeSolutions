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
    StringBuilder sb = new StringBuilder();
    List<String> arr = new ArrayList<>();
    int index = 0;
    public void serializee(TreeNode root)
    {
        if(root==null){
            sb.append("null"+" ");
            return;
        }
        sb.append(root.val+" ");
        serializee(root.left);
        serializee(root.right);
    }
    public String serialize(TreeNode root) {
      serializee(root);
      return sb.toString();
    }

    public TreeNode deserialize(String[] arr){
        if(arr[index].equals("null")){
            index+=1;
            return null;
        }
        
        TreeNode root = new TreeNode(Integer.parseInt(arr[index]));
        index+=1;
        root.left=deserialize(arr);
        root.right=deserialize(arr);
        return root;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] arr=data.split(" ");
        return deserialize(arr);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;