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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        while(que.size() > 0){
            int sz = que.size();
            List<Integer> temp = new ArrayList<>();
            while(sz-- > 0){
                TreeNode rem = que.remove();
                temp.add(rem.val);
                if(rem.left != null){
                    que.add(rem.left);
                }
                if(rem.right != null){
                    que.add(rem.right);
                }
            }
            ans.add(0,temp);
        }
        return ans;
    }
}