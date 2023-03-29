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
    public int countNodes(TreeNode root) {
        if(root==null)      return 0;
        int left=getLH(root);
        int right=getRH(root);
        if(left==right)          return (int)(Math.pow(2,left))-1;;
        return countNodes(root.left)+countNodes(root.right)+1;
    }
    public int getLH(TreeNode root){
        if(root==null)         return 0;
        return getLH(root.left)+1;
     }
     public int getRH(TreeNode root){
         if(root==null)         return 0;
        return getRH(root.right)+1;
     }
}
       