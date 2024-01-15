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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        helper(new ArrayList<>(), root, 0, targetSum, result);
        return result;
    }

    public void helper(List<Integer> path, TreeNode node, int sum, int target, List<List<Integer>> result) {
        if (node == null) {
            return;
        }
        
        path.add(node.val);
        sum += node.val;

        if (node.left == null && node.right == null && sum == target) {
            result.add(new ArrayList<>(path));
        }

        helper(path, node.left, sum, target, result);
        helper(path, node.right, sum, target, result);

        path.remove(path.size() - 1);
    }
}