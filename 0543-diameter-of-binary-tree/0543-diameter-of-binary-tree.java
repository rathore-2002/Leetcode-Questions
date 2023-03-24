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
    int ans=0;
    public int diameterOfBinaryTree(TreeNode root) {
        getDiameter(root);
        return ans==0?0:ans-1; 
    }
    private int getDiameter(TreeNode root){
        if(root==null) return 0;
        int l=getDiameter(root.left);
        int r=getDiameter(root.right);
        ans=Math.max(ans,l+r+1);
        return Math.max(l,r)+1;
    }
}