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
    public int diameterOfBinaryTree(TreeNode root) {
        int dia[] = new int[1];
        helper(root,dia);
        return dia[0];
    }
    private int helper(TreeNode root,int dia[]){
        if(root==null)    return 0;
        int l=helper(root.left,dia);
        int r=helper(root.right,dia);
        dia[0]=Math.max(dia[0],l+r);
        return Math.max(l,r)+1;
    }
}