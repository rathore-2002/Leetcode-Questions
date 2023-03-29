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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> inMap = new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            inMap.put(inorder[i],i);
        }
        return buildTree(preorder,0,preorder.length-1,inorder,0,inorder.length-1,inMap);
    }
    public TreeNode buildTree(int[] preorder,int ps,int pe,int[] inorder,int is,int ie,HashMap<Integer,Integer> inMap){
        if(ps>ps || is>ie){
            return null;
        }
        TreeNode root = new TreeNode(preorder[ps]);
        int inRoot=inMap.get(root.val);
        int numsLeft=inRoot-is;
        root.left=buildTree(preorder,ps+1,ps+numsLeft,inorder,is,inRoot-1,inMap);
        root.right=buildTree(preorder,ps+numsLeft+1,pe,inorder,inRoot+1,ie,inMap);
        
        return root;
    }
}