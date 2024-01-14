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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        return hasPathSumHelper(root, targetSum, root.val);
    }
    public boolean hasPathSumHelper(TreeNode root, int targetSum, int currentSum) {
        boolean flag1 = false, flag2 = false;
        if(root.right == null && root.left == null && currentSum == targetSum) return true;
        if(root.right != null) flag1 = hasPathSumHelper(root.right, targetSum, currentSum+root.right.val);
        if(root.left != null) flag2 = hasPathSumHelper(root.left, targetSum, currentSum+root.left.val);
        return  flag1 || flag2;
    }
}