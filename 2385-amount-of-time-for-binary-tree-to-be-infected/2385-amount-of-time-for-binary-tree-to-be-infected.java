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
  private int ans;

  public int amountOfTime(TreeNode root, int start) {
    dfs(root, start);
    return ans;
  }

  public int dfs(TreeNode root, int start) {
    if (root == null) return 0;

    int leftDepth = dfs(root.left, start);
    int rightDepth = dfs(root.right, start);

    if (root.val == start) {
      ans = Math.max(leftDepth, rightDepth);
      return -1;
    } else if (leftDepth >= 0 && rightDepth >= 0) {
      return Math.max(leftDepth, rightDepth) + 1;
    } else {
      ans = Math.max(ans, Math.abs(leftDepth - rightDepth));
      return Math.min(leftDepth, rightDepth) - 1;
    }
  }
}