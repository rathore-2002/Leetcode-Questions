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
     
    public static void helper(TreeNode root,ArrayList<Integer> ls){
        if(root==null)
            return ;
        
        ls.add(root.val);
        helper(root.left,ls);
        helper(root.right,ls);
        
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> ls=new ArrayList<>();
        helper(root,ls);
        return ls;
    }
}