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
    // public void constructBinaryTree(int[][] descriptions,int i,Map<TreeNode,TreeNode> hm){
    //     if(i>=descriptions.length){
    //         return;
    //     }
    //     int parent = descriptions[i][0];
    //     int child = descriptions[i][1];
    //     int isLeft = descriptions[i][2];

    //     if(hm.containsKey(parent)){
    //         if(isLeft==1){
    //             TreeNode t = new TreeNode(child);
    //             hm.get(parent).left=t;
    //             hm.put(t,hm.get(parent));
    //         }else{
    //             TreeNode t = new TreeNode(child);
    //             hm.get(parent).right=t;
    //             hm.put(t,hm.get(parent));
    //         }
    //         return ;
    //     }

    //     TreeNode p = new TreeNode(parent);
    //     TreeNode c = new TreeNode(child);
    //     hm.put(c,p);
    //     hm.put(p,null);
    //     if(isLeft==1){
    //             p.left=c;
    //         }
    //     else{
    //             p.right=c;
    //     }
    //     constructBinaryTree(descriptions,i+1,hm);
    // }
    public TreeNode createBinaryTree(int[][] descriptions) {
        
        TreeNode[] address = new TreeNode[1000000];
        TreeNode head = null;
        Map<TreeNode,TreeNode> hm = new HashMap<>();
       
        for(int i=0;i<descriptions.length;i++){
            int parent=descriptions[i][0];
            int child = descriptions[i][1];
            int isLeft = descriptions[i][2];


            if(address[parent]==null)
            {
                TreeNode p = new TreeNode(parent);
                if(address[child]!=null)
                {
                    address[parent]=p;
                    if(isLeft==1) p.left=address[child];
                    else p.right=address[child];
                    head=p;
                    hm.put(address[child],p);
                }
                else
                {
                TreeNode c = new TreeNode(child);
                address[parent]=p;
                address[child]=c;
                if(isLeft==1) p.left=c;
                else p.right=c;
                head=p;
                hm.put(c,p);
                }
                if(!hm.containsKey(p)) hm.put(p,null);
            }

            else
            {
                if(address[child]!=null)
                {
                    if(isLeft==1) address[parent].left=address[child];
                    else address[parent].right=address[child];
                    hm.put(address[child],address[parent]);
                }
                else 
                {
                TreeNode c = new TreeNode(child);
                address[child]=c;
                if(isLeft==1) address[parent].left=c;
                else address[parent].right=c;
                hm.put(c,address[parent]);
                }
            }
        }
       for(Map.Entry<TreeNode,TreeNode> m : hm.entrySet()){
        if(m.getValue()==null)  return m.getKey();
       }
       return null;
    }
}