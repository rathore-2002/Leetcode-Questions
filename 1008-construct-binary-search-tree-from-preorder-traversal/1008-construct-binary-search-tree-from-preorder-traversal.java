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
    static int index;
    public TreeNode bstFromPreorder(int[] preorder) {
        index = 0;
        return bstFromPreorder(preorder,Integer.MAX_VALUE,Integer.MIN_VALUE);
    }
    public TreeNode bstFromPreorder(int[] preorder,int upperBound,int lowerBound){
        
        if(index>=preorder.length || preorder[index]>upperBound || preorder[index]<lowerBound) return null;
        TreeNode root = new TreeNode(preorder[index++]);
        
        root.left = bstFromPreorder(preorder,root.val,lowerBound);
        root.right = bstFromPreorder(preorder,upperBound,root.val);
        return root;
            
    }

}