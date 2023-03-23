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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new LinkedList<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root==null)
        return ans;
        queue.add(root);
        while(!queue.isEmpty()){
            ArrayList<Integer> a = new ArrayList<>();
            int levelno = queue.size();
            for(int i=0;i<levelno;i++){
                if(queue.peek().left!=null) 
                queue.add(queue.peek().left);
                if(queue.peek().right!=null) 
                queue.add(queue.peek().right);

                a.add(queue.remove().val);
            }
            ans.add(a);
        }
        return ans;
    }
}