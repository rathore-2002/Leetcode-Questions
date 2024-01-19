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
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<TreeNode> ans = new ArrayList<>();
        if(root==null)
            return -1;
        inorder(root,ans);
        return ans.get(k-1).val;
    }
    public void inorder(TreeNode root, ArrayList<TreeNode> ans) {
        if(root==null)
            return;
        inorder(root.left,ans);
        ans.add(root);
        inorder(root.right,ans);
    }
}